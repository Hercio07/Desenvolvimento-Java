/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */import mercado.Produto;

  import java.util.ArrayList;
   import java.util.List;

public class Client {
    private String name;
    private String contactInfo;
    private List<Item> itemsOrdered;
    private Payment payment;

    public Client(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.itemsOrdered = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.itemsOrdered.add(item);
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Item> getItemsOrdered() {
        return itemsOrdered;
    }

    public Payment getPayment() {
        return payment;
    }

    public double getTotalAmount() {
        double totalAmount = 0;
        for (Item item : itemsOrdered) {
            totalAmount += item.getProduct().getPrice() * item.getQuantity();
        }
        return totalAmount;
    }

    public boolean processPayment() {
        double totalAmount = getTotalAmount();
        if (payment.getAmount() >= totalAmount) {
            for (Item item : itemsOrdered) {
                int newQuantityInStock = item.getProduct().getQuantityInStock() - item.getQuantity();
                item.getProduct().setQuantityInStock(newQuantityInStock);
            }
            return true;
        }
        return false;
    }
}

