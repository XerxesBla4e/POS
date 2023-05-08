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
public class purchbin {
   private int purch_Id;
   private String name;
   private  int quantity;
   private float price;
   private String dop;
   private String p_unit;
   

    public purchbin(int purch_Id, String name, int quantity, float price, String dop,String p_unit) {
        this.purch_Id = purch_Id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.dop = dop;
        this.p_unit=p_unit;
    }

    public int getPurch_Id() {
        return purch_Id;
    }

    public void setPurch_Id(int purch_Id) {
        this.purch_Id = purch_Id;
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

    public String getDop() {
        return dop;
    }

    public void setDop(String dop) {
        this.dop = dop;
    }

    public String getP_unit() {
        return p_unit;
    }

    public void setP_unit(String p_unit) {
        this.p_unit = p_unit;
    }
    
   
}


