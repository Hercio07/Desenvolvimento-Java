/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

/**
 *
 * @author Dell
 */import mercado.Produto;
public class Item {

    private Produto product;
    private int quantity;

    public Item(Produto product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Produto getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}


   


