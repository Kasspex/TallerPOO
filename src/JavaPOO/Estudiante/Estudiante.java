package JavaPOO.Estudiante;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int codigo;

    public Estudiante(){

    }

    public Estudiante(String nombre, String apellido, int codigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    //GETTERS Y SETTERS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public  void decirNombre(){
        System.out.println("Mi nombre es: " + this.nombre);
    }
}
