package com.Module2;

class CommandTest{
    public static void main(String[] args) {
        if(args.length == 2) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
        }
    }
}