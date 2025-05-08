package TallerPOO;

import java.util.List;
import java.util.ArrayList;

public class Pedidos {
    // Set attributes
    // Set Constructors
    // Set Getters and Setters
    // Set Methods

    // 1. Attributes
    private int orderNumber;
    private String customerName;
    private double total = 0;
    private List<String> products = new ArrayList<>();

    // 2. Constructors
    public Pedidos(int orderNumber, String customerName, double total,List<String> products) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.total = total;
        this.products = products;
    }

    public Pedidos() {
    }

    // 3. Getters and Setters

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    // 4. Methods
    public void addProducts(String product, double price){
        this.products.add(product);
        this.total = this.total + price ;

    }

    public void applyDiscount(double discount) {
        // Validate input
        if (discount <= 100 && discount >= 1) {
            double precioFinal = total - (total * discount / 100);
            this.total = precioFinal;
            System.out.println("Se aplico el % " + discount);
        } else {
            System.out.println("Input invalido. No se puede agregar el descuento");
        }
    }
    public void mostarPedido() {
        System.out.println("Tu pedido es:");
        System.out.println("Numero de orden: " + orderNumber);
        System.out.println("Cliente: " + customerName);
        System.out.println("Total: " + total);
        System.out.println("Productos" + products);
    }
}