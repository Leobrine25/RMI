import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
  public static void main(String[] args) {
    //iniciar o Scanner para pegar as coordenadas digitadas
    //a,b para Primeiro Ponto e c,d para o Segundo Ponto
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Entre com valores x e y do Primeiro ponto, separado por espaço:");
    double a = keyboard.nextDouble();
    double b = keyboard.nextDouble();
    System.out.println("\nEntre com valores x e y do Segundo ponto, separado por espaço:");
    double c = keyboard.nextDouble();
    double d = keyboard.nextDouble();
    //Fechamento do keyboard
    keyboard.close();
  
    try{
      //Chamada do Lookup utilizando as portas padroes e o serviço no registry
      Calculo calc = (Calculo) Naming.lookup("rmi://*IP LOCAL*:1099/CalcService");
      System.out.println("\nResposta é :" + calc.distancia(a,b,c,d));
      
    }catch (Exception e) {
      //Caso ocorra erro
      System.err.println("erro server: " + e.toString() + "\n"); 
      e.printStackTrace(); 
    } 
  }
}
