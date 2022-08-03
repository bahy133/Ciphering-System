/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cipheringsystem;

/**
 *
 * @author QT
 */
public abstract class cipher {
    private char [] UpperCaseLetters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
        'S','T','U','V','W','X','Y','Z'};
    private char [] LowerCaseLetters={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
        's','t','u','v','w','x','y','z'};
    
    abstract String ceaser(String in,String key);
    abstract String vignere(String in);
    abstract String hill(String in);
    abstract String playfair(String in);

    public char[] getUpperCaseLetters() {
        return UpperCaseLetters;
    }

    public char[] getLowerCaseLetters() {
        return LowerCaseLetters;
    }
    
}

