package herencia;

public class empleado extends persona{
    int num_legajo;
    String cargo;
    double Sueldo;
    public empleado(){

    }
    public empleado(int id, 
    int dni, 
    String nombre, 
    String apellido, 
    String domicilio, 
    String telefono, 
    int num_legajo, 
    String cargo, 
    double Sueldo){
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_legajo= num_legajo;
        this.cargo= cargo;
        this.Sueldo= Sueldo;
    }
    //Getters
    public int getNum_legajo(){
        return num_legajo;
    }
    public String getCargo(){
        return cargo;
    }
    public double getSueldo(){
        return Sueldo;
    }
    //Setters
    public void setNum_legajo(int num_legajo){
        this.num_legajo=num_legajo;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    }
    public void setSueldo(double Sueldo){
        this.Sueldo=Sueldo;
    }
    
}   

