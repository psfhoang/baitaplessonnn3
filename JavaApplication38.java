/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so hang va so cot cua ma tran 1");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        System.out.println("nhap vao so hang va so cot cua ma tran 2");
        int m2=sc.nextInt();
        int n2=sc.nextInt();
        int [][] a1= new int[m1][n1];
        int [][] a2= new int[m2][n2];
        if(m1!=m2||n1!=n2)
        {
            System.out.println("k cong duoc ma tran");
        }
        else
        {
            System.out.println("nhap ma tran 1");
            for(int i = 0;i<m1;i++)
            {
                for(int j=0;j<n1;j++)
                {
                    System.out.println("a["+i+"]["+j+"]");
                    a1[i][j]=sc.nextInt();
                }
            }
             System.out.println("nhap ma tran 2");
            for(int i = 0;i<m1;i++)
            {
                for(int j=0;j<n1;j++)
                {
                    System.out.println("a["+i+"]["+j+"]"+"\t");
                    a2[i][j]=sc.nextInt();
                }
            }
            System.out.println("tong 2 ma tran la");
            for(int i = 0;i<m2;i++)
            {
                for(int j=0;j<m2;j++)
                {
                    System.out.print(a1[i][j]+a2[i][j]+"\t");
                    
                }
                System.out.println("");
            
        }
        
    }
    }
}
    

