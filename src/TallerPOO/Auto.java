package TallerPOO;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje = 0;


    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public void mostrarInformacion(){
        System.out.printf("El auto con marca: %s, modelo: %s del año %d y kilometraje %d %n" , this.marca, this.modelo, this.anio, this.kilometraje);
    }

    public void actualizarKilometraje(int kms){
        if (kms>0){
            this.kilometraje += kms;
        }else{
            System.out.println("No se puede agregar un kilometraje negativo");
        }

    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
}
