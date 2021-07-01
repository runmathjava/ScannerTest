/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seongkim.scannertest;

import java.util.Scanner;

/**
 *
 * @author aboxi
 */
public class ScannerTest {
    public static void main(String[] args) {
        
        String name;
        int age;
        int numComputers;
        String hometown;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        name = sc.nextLine();
        System.out.println("What is your age? ");
        age = sc.nextInt();
        System.out.println("Also, the number of computers? ");
        numComputers = sc.nextInt();
        sc.nextLine();
        System.out.println("What about the hometown? ");
        hometown = sc.nextLine();
        
        System.out.println("So, your name is " + name);
        System.out.println("And your age is " + age);
        System.out.println("Also, the number of computers is " + numComputers);
        System.out.println("And the home town is " + hometown);
        
    }
    
}
