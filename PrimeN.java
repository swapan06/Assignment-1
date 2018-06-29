
package acadviewdemo1;
import java.util.Scanner;
public class PrimeN {
     public static void main(String[]args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the value of N =");
        int n= num.nextInt();
        System.out.println("Entered value of N= "+n);
        int x,y,z;
        System.out.println("List of Prime Numbers:");
        for(x=2;x<n;x++)
        {
            z=0;
            for(y=2;y<x;y++)
            {
                if (x%y==0)
                    z=1;
            }
            if(z==0)
                    {
                        System.out.println(x);
                    
        }
    }

    
    }
}


