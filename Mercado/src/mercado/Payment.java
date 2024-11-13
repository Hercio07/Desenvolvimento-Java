/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

/**
 *
 * @author Dell
 */

    public class Payment {
    public enum PaymentType {
        MONEY, CHEQUE, CARD
    }

    private PaymentType type;
    private double amount;

    public Payment(PaymentType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public PaymentType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}


