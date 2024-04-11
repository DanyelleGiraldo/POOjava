package logica;

public class POO {
    public static void main(String[] args) {
        alumno alu1= new alumno();
        alumno alu2 = new alumno(12, "Danilo", "Giraldo");

        System.out.println(alu2.getId());
    }
}
