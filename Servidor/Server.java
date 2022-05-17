//import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) {
        try{
            //Primeiramente, 'cria-se" uma propriedade que o hostname é o ip da maquina
            System.setProperty("java.rmi.server.hostname", "192.168.1.103");
            //cria-se a chamada da função calc e faz o stub dela
            Calculo calc = new impCalculo();
            //o port do stub não pode ser a mesma do Registry(1099), 
            //por motivo de facilidade, port 0 foi escolhida
            Calculo stub = (Calculo) UnicastRemoteObject.exportObject(calc,0);
            Registry registry = LocateRegistry.getRegistry();
            //Feito o bind, o Cliente pode chamar o CalcService
            registry.bind("CalcService", stub);
            //mensagem de confirmação que o servidor está online; 
            System.out.println("Server Funcionando\n"+
            "Não se esqueça de limpar após rodando ClearRegistry");
        }catch (Exception e){
            System.err.println("erro server: " + e.toString() + "\n");
            //e.printStackTrace();
        }
    }
}
