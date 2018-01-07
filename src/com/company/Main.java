package com.company;


import java.util.*;
import java.lang.*;
import java.io.*;



public class Main
{


    public static void main (String[] args) throws java.lang.Exception
    {
        Unit units[] = new Unit[4];
        units[0] = new Dog(new Point(1, 0), 1, 2);
        units[2] = new Dog(new Point(11, 10), 2, 4);
        units[1] = new Tree(new Point(12, -3), 5, true);
        units[3] = new Tree(new Point(13, 1), 3, false);
        ((Dog)units[0]).setSpeed(new Point(1, 2));
        ((Dog)units[2]).setSpeed(new Point(-10, -4));
        for(int i = 0; i < 4; ++i)
        {
            System.out.println(units[i]);
        }
        System.out.println();
        MoovingUnit[] munits = new MoovingUnit[3];
        munits[1] = new Dog(new Point(11, 10), 2, 4);
        munits[1].setSpeed(new Point(1, 2));
        munits[0] = new User("Daniil", 16, false);
        munits[0].setSpeed(new Point(0, 0));
        munits[2] = new User("Alex", 17, true);
        munits[2].setSpeed(new Point(100, 10));
        for(int i = 0; i < 3; ++i)
        {
            System.out.println(munits[i]);
        }
        System.out.println();
        ((Dog)munits[1]).Grow();
        System.out.println(munits[1]);
        System.out.println();
        ((User)munits[0]).visitSirius();
        System.out.println(munits[0]);
    }
}
