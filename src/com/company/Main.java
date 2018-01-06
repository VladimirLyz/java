package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{


    public static void main (String[] args) throws java.lang.Exception
    {
        Transport t1  = new Transport(0, 3, "Gaz");
        Transport t2  = new Transport(4, 30, "Gazel");
        Car c1 = new Car(10, "Rear", "BMW");
        Car c2 = new Car(c1);
        c2.accelerate(30);
        System.out.println(t1.getVelocity()+ " " + t1.getWeels()+ " " +t1.getBrand());
        System.out.println(t2.getVelocity()+ " " + t2.getWeels()+ " " +t2.getBrand());
        System.out.println(c1.getVelocity()+ " " + c1.getWeels() + " "+ c1.getBrand());
        System.out.println(t2.getVelocity()+ " " + t2.getWeels());
    }
}
