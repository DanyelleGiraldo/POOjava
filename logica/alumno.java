package logica;

public class alumno {
    int id;
    String Nombre;
    String Apellido;

    public alumno(){ 
    }

    public alumno(int id, String Nombre, String Apellido){
        this.id= id;
        this.Nombre= Nombre;
        this.Apellido= Apellido;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre= Nombre;
    }

    public String getApellido(){
        return Apellido;
    }

    public void setApellido(String Apellido){
        this.Apellido= Apellido;
    }

    public void MostrarNombre(){
        System.out.println("hola, soy un alumno y mi nombre es: " );
    }

    public void saberAprobado(double Nota){
        if (Nota >= 70){
            System.out.println("aprobe la materia");
        }
        else {
            System.out.println("no aprobe");
        }
    }
}
