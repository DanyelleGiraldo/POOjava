package herencia;

public class Jefe extends persona {
    int id_jefe;
    String Departamento_jefe;
    public Jefe(){
    }
    public Jefe(int id, int dni, String nombre, String apellido, String domicilio, String telefono,int id_jefe, String Departamento_jefe){
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.Departamento_jefe = Departamento_jefe;
    }

    //getters
    public int getId_jefe(){
        return id_jefe;
    }
    public String getDepartamento_jefe(){
        return Departamento_jefe;
    }
    //setters
    public void setId_jefe(int id_jefe){
        this.id_jefe = id_jefe;
    }
    public void setDepartamento_jefe(String Departamento_jefe){
        this.Departamento_jefe = Departamento_jefe;
    }

}
