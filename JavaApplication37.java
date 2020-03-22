/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication37;

/**
 *
 * @author phamv
 */
public class JavaApplication37 {

   
    public static boolean tich(int a, int b)
    {
        if(a*b%15==0) return true;
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(tich(10,2));
    }
    
}
