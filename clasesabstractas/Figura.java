package clasesabstractas;

public abstract class Figura {
    
    protected double x;//poss en x
    protected double y;//poss en y

    protected Figura() {
    }

    protected Figura(double x, double y){
        this.x= x;
        this.y=y;
    }

    public abstract double areaCalculate();

}
