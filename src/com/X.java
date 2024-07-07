package com;

public class X {
    
    public static void main(String[] args) {
        ABC:
        for (int i = 0; i < 10; i++) {
            System.out.println("Outer Loop "+i);
            XYZ:
            for (int j = 0; j < 10; j++) {
                System.out.println("Inner Loop "+j);
                continue ABC;
            }
        }
    }
    
}