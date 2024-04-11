package herencia;

public class persona {
    int id;
    int dni;
    String nombre;
    String apellido;
    String domicilio;
    String telefono;
    public persona(){

    }
    public persona(int id, int dni, String nombre, String apellido, String domicilio, String telefono){
        this.id= id;
        this.dni= dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    //Getters
    public int getId(){
        return id;
    }
    public int getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public String getTelefono(){
        return telefono;
    }
    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setDomicilio(String domicilio){
        this.domicilio=domicilio;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }

}
