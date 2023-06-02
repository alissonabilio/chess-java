package com.example.demo.entidade;
@Entity
public class Product {

    public String name;
    public double price;
    public int quantily;

    public double multiplication() {
        return price * quantily;
    }

    public void toAdd(int quantily) {
        this.quantily += quantily;

    }
    public void toRemove(int quantily) {
        this.quantily -= quantily;

    }
}
