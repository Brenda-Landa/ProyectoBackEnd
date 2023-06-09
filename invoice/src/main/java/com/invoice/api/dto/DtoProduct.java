package com.invoice.api.dto;

/*
 * Requerimiento 3
 * Agregar atributos de clase para la validación del producto
 */
public class DtoProduct {
    private String gtin;
    private int stock;
    private double price;
    public String getGtin() {
        return gtin;
    }
    public void setGtin(String gtin) {
        this.gtin = gtin;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "DtoProduct [gtin:" + gtin + ", stock:" + stock + ", price:" + price + "]";
    }
}
