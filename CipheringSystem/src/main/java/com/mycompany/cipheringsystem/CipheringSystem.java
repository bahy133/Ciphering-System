/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cipheringsystem;

import java.util.Scanner;

/**
 *
 * @author QT
 */
public class CipheringSystem {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String select;
        
        
        System.out.println("1-Encryption");
        System.out.println("2-decryption");
        select=input.next();
        if(select.equals("1")){
            Scanner in=new Scanner(System.in);
            System.out.println("Enter your text: ");
            String txt=in.nextLine();
            cipher en=new Encrypt();
            System.out.println("1-ceaser");
            System.out.println("2-vinere");
            System.out.println("3-hill");
            System.out.println("4-playfair");
            select=input.next();
            if(select.equals("1")){
      
                System.out.print("Enter Key: ");
                String key=input.next();
                System.out.println("Ceaser Encryption");
                System.out.println(en.ceaser(txt,key));
            }
            else if(select.equals("2")){
                System.out.println("Vignere Encryption");
                System.out.println(en.vignere(txt));
            }
            else if(select.equals("3")){
                System.out.println("hill Encryption");
                System.out.println(en.hill(txt));
            }
        }
        
    }
}
