package JavaPOO;

public class Auto {

    //Atributos
    String color;
    String marca;
    int modelo;


    //Constructores
    public Auto(){
    }

    public Auto(String color, String marca, int modelo){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }





    //Metodos

    public void arrancar(){
        System.out.println("El carro arrancó");
    }

    public void frenar(){
        System.out.println("El carro frenó");
    }

    public void mostrarDatos(){
        System.out.println("El carro " + color + " modelo " + modelo +
                " es de la marca " + marca);
    }
}
