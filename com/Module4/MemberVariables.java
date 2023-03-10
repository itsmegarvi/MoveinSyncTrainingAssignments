package com.Module4;

class Product{
    String productCode = "P101";
    String productname = "Shampoo";
    double productPrice = 25.210;


}

public class MemberVariables {
    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("Product Code :" + p.productCode);
        System.out.println("Product Name :" + p.productname);
        System.out.println("Product Price :" + p.productPrice);

        Product p1 = new Product();
        p1.productPrice = 845210.20;
        p1.productname = "Ferrari";
        p1.productCode = "F18";
        System.out.println("Product Code :" + p1.productCode);
        System.out.println("Product Name :" + p1.productname);
        System.out.println("Product Price :" + p1.productPrice);
    }
}
