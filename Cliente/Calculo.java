import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculo extends Remote{
    //chamada para o calculo da distancia
    public double distancia(double a, double b, double c, double d) throws RemoteException;
}