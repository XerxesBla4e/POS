/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author xerxes54
 */
public class inventorybin {
    private int Id;
    private String name;
    private int quantity;
    private float price;
    private String date;
    private String unit;

    public inventorybin(int Id, String name, int quantity, float price, String date, String unit) {
        this.Id = Id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.unit = unit;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
}
