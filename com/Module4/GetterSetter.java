package com.Module4;

import java.util.Scanner;

class Products{
    private String productName;
    private String productCode;
    private double productPrice;

    public String getProductName(){
        return productName;
    }

    public void setProductName(String s){
        productName = s;
    }

    public String getProductCode(){
        return productCode;
    }

    public void setProductCode(String ss){
        productCode = ss;
    }

    public double getproductPrice(){
        return productPrice;
    }

    public void setProductPrice(double d){
        productPrice =  d;
    }
}
public class GetterSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Products p = new Products();
        p.setProductCode(sc.next());
        p.setProductName(sc.next());
        p.setProductPrice(sc.nextDouble());
        System.out.println("Product Code :" + p.getProductCode());
        System.out.println("Product Name :" + p.getProductName());
        System.out.println("Product Price :" + p.getproductPrice());
    }
}
