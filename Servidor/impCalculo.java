import java.rmi.RemoteException;

public class impCalculo implements Calculo {
    public double distancia(double a, double b, double c, double d) throws RemoteException{
        //Distancia entre 2 pontos = raizQuadrada de (x1-x2)^2+(y1-y2)^2;
        //primeiramente, descobrir x1-x2 e y1-y2
        double x = a-c;
        double y = b-d;
        //Fazer a multiplicação x^2 e y^2
        x = x*x;
        y = y*y;
        //Fazer a soma e retornar a raiz quadrada do resultado
        double resposta = x+y;
        return Math.sqrt(resposta);
        //poderia ter feito tudo em uma só linha, mas por motivos de apresentação,
        //algo assim é melhor
    }
}