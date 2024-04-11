package herencia;

public class consultor extends persona{
    String nombre_consultor;
    int numero_consultor;

    public consultor(){

    }
    public consultor(int id, int dni, String nombre, String apellido, String domicilio, String telefono, String nombre_consultor, int numero_consultor){
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultor = nombre_consultor;
        this.numero_consultor = numero_consultor;
    }
    //getter
    public String getNombre_consultor(){
        return nombre_consultor;
    }
    public int getNumero_consultor(){
        return numero_consultor;
    }
    //setter
    public void setNombre_consultor(String nombre_consultor){
        this.nombre_consultor = nombre_consultor;
    }
    public void setNumero_consultor(int numero_consultor){
        this.numero_consultor = numero_consultor;
    }
}
    

