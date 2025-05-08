package TallerPOO;

public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreDueno;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, String nombreDueno, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreDueno = nombreDueno;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void depositar(double monto){
        if (monto > 0){
        this.saldo += monto;
        }else{
            System.out.println("Error: monto a depositar es menor que 0" );
        }
    }

    public void retirar(double monto){
        if (this.saldo >= monto){
            this.saldo -= monto;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrarDatos(){
        System.out.println("La cuenta " + this.numeroCuenta + " de " + this.nombreDueno + " de tipo " + this.tipoCuenta + "\n"
                + "tiene saldo de " + this.saldo);
    }
}
