package com.Module4;

class Product1{
    private String productName;
    private String productCode;
    private double productPrice;

    Product1(String pn,String pc, double pp){
        productCode = pc;
        productName = pn;
        productPrice = pp;
    }

    void disp(){
        System.out.println("Product Code :" + productCode);
        System.out.println("Product Name :" + productName);
        System.out.println("Product Price :" + productPrice);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Product1 p = new Product1("p105","Brush",45.25);
        p.disp();
    }
}
