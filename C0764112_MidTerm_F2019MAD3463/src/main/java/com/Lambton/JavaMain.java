package com.Lambton;

public class JavaMain
{
    public static void main(String[] args) {

        String a="Lambton";
        LambtonStringTools obji= new LambtonStringTools();
        System.out.println(obji.reverse(a));


        String Name = "Lambton College Toronto";
        LambtonStringTools obj1= new LambtonStringTools();
        System.out.println(obj1.initials(Name));

    }
}
