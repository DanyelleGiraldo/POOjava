package clasesabstractas;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(){

    }

    public Cuadrado(double lado, double x, double y){
        super(x,y);
        this.lado= lado;
    }

@Override
public double areaCalculate(){
    double Resultado= lado*lado;
    return Resultado;
}
}
