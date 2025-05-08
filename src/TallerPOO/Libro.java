package TallerPOO;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible = true;

    public Libro() {
    }


    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }



    public void mostrarDetalles(){
        if (disponible){
            System.out.println("----LIBRERIA----");
            System.out.println(this.titulo + this.autor + this.anioPublicacion + " Disponible");
        }else{
            System.out.println("----LIBRERIA----");
            System.out.println(this.titulo + this.autor + this.anioPublicacion + " No disponible");
        }
    }

    public void prestar(){
        if (disponible){
            disponible = false;
            System.out.println( this.titulo + " prestado");
        }else{
            System.out.println("Libro no disponible");
        }
    }

    public void devolver(){
        if (!disponible){
            disponible = true;
            System.out.println("Gracias por devolver el libro" + this.titulo);
        }else{
            System.out.println("El libro ya esta disponible");
        }
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
