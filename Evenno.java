/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadviewdemo1;

import java.util.Scanner;

/**
 *
 * @author IT-CARE
 */
public class Evenno {
     public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("enter the value of n");
        for(int i=1;i<=n;i++)
        {
            if(n%2==0)
            {
                System.out.println(n +" ");
            }
        }
    }
}
    
    
    

