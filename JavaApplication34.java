/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class JavaApplication34 {
    private Integer a[];
    private int n;

   static int [] sapxeptangdan(int [] a)
    {
        int max=a[0];
        for(int i = 0 ; i<a.length;i++){
            for(int j = 0 ; j<a.length;j++)
            {
        
            if( a[i]<a[j])
            {
                max=a[i];
                a[i]=a[j];
                a[j]=max;
            }
        }
        }
        return a;
    }
    static int [] sapxepgiamdan(int [] a)
    {
        int min=a[0];
        for(int i = 0 ; i<a.length;i++){
            for(int j = 0 ; j<a.length;j++)
            {
        
            if( a[i]>a[j])
            {
                min=a[j];
                a[j]=a[i];
                a[i]=min;
            }
        }
        }
        return a;
    }
    static int op(int [] a)
    {
        int [] b = sapxeptangdan(a);
       if(Arrays.equals(a,b)==true) return 1;
       if(Arrays.equals(a,sapxepgiamdan(a))==true) return 1;
       return 0;
    }
    static int[] nhapmang(){
        
       
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap sp phan tu cua mang");
        int n = sc.nextInt();
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap a["+i+"]");
            a[i]=sc.nextInt();
        }
        return a;
        
    }
    static void xuatmang(int [] a)
    {
        for(int i=0 ; i<a.length ; i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
    public static void main(String[] args) {
      
        int []  b ;
        
        b=nhapmang();
        int c = op(b);
//        xuatmang(b);
        sapxeptangdan(b);
        System.out.println(c);
       
                
    }
    
}
