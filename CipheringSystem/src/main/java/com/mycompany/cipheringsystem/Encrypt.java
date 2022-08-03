/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cipheringsystem;

import java.util.Scanner;

/**
 *
 * @author QT
 */
public class Encrypt extends cipher{
    private char[] lower=getLowerCaseLetters();
    private char[]upper=getUpperCaseLetters();
    
    String VinereWithRepeatingKey(String in){
        String output="";
        in=in.toLowerCase();
        String keyword;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your KeyWord: ");
        keyword=input.nextLine();
        int keywordcount=0;
        for (int i = 0; i < in.length(); i++) {
            if(in.charAt(i)==' '){
                output+=in.charAt(i);
                continue;
            }
                
            output+=ceaser(String.valueOf(in.charAt(i)) ,String.valueOf(keyword.charAt(keywordcount)));
            keywordcount++;
            if(keywordcount==keyword.length())
                keywordcount=0;
            
            
        }
        return output;
    }
    String VinereWithAutoKey(String in){
        String output="";
        in=in.toLowerCase();
        String keyword;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your KeyWord: ");
        keyword=input.nextLine();
        int keywordcount=0;
        keyword=keyword+in;
        for (int i = 0; i < in.length(); i++) {
            if(in.charAt(i)==' '){
                output+=in.charAt(i);
                continue;
            }
            output+=ceaser(String.valueOf(in.charAt(i)) ,String.valueOf(keyword.charAt(keywordcount)));
            keywordcount++;
            if(keywordcount==keyword.length())
                keywordcount=0;
        }
        return output;
    }
    @Override
    String ceaser(String in,String key) {
        String output="";
        in=in.toLowerCase();
        //int [] Keynumbers={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int k=0;
        int res=0;
        
        
        
        if(Character.isUpperCase(key.charAt(0))){
            for (int i = 0; i < upper.length; i++) {
                if(upper[i]==key.charAt(0)){
                    k=i;
                    break;
                }
                    
                    
            }
        }
        else if(Character.isLowerCase(key.charAt(0))){
            for (int i = 0; i < lower.length; i++) {
                if(lower[i]==key.charAt(0)){
                    k=i;
                    break;
                }
                    
                    
            }
        }
        
        for (int i = 0; i < in.length(); i++) {
            if(in.charAt(i)==' ' ||in.charAt(i)=='.'||in.charAt(i)=='\n')
                output+=in.charAt(i);
            else{
                for (int j = 0; j < lower.length; j++) {
                    if(in.charAt(i)==lower[j]){
                        res=(j+k)%26;
                        output+=lower[res];
                        break;
                    }
                        
                }
            }
            }
        return output;
    }

    @Override
    String vignere(String in) {
        String output="";
        Scanner input =new Scanner(System.in);
        String select;
        System.out.println("1-Vinere with repeating key ");
        System.out.println("2-Vinere with auto key ");
        select=input.next();
        if(select.equals("1"))
            output=VinereWithRepeatingKey(in);
        else if(select.equals("2"))
            output=VinereWithAutoKey(in);
        else
            System.out.println("Wrong choice");
        return output;
    }

    @Override
    String hill(String in) {
        in=in.toLowerCase();
        //int [] Keynumbers={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        String output="";
        Scanner input =new Scanner(System.in);
        String key;
        int[]arr1;
        int []arr2;
        int[] resarr;
        System.out.println("Enter Key must be "+in.length()+"x"+in.length());
        key=input.nextLine();
        key=key.toLowerCase();
        if(key.length()!=in.length()*in.length()){
            throw new UnsupportedOperationException("key size incompatible");
            
        }
        else{
            arr2=new int[in.length()*in.length()];
            arr1=new int[in.length()];
            int count=0;
            int index=0;
            resarr=new int[in.length()];
            int c=0;
            int idx=0;
            for (int i = 0; i < in.length(); i++) {
                for (int j = 0; j < lower.length; j++) {
                    if(in.charAt(i)==lower[j]){
                        arr1[idx]=j;
                        idx++;
                        break;
                    }
                }
            }
            idx=0;
            for (int i = 0; i < key.length(); i++) {
                for (int j = 0; j < lower.length; j++) {
                    if(key.charAt(i)==lower[j]){
                        arr2[idx]=j;
                        idx++;
                        break;
                    }
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                c+=(arr1[count]*arr2[i]);
                count++;
                if(count==in.length()){
                    count=0;
                    resarr[index]=c%26;
                    c=0;
                    index++;
                }
                    
            }
            
        }
        for (int i = 0; i < resarr.length; i++) {
            output+=lower[resarr[i]];
        }
        return output;
    }

    @Override
    String playfair(String in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
