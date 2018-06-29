
package acadviewdemo1;
import java.util.Scanner;
public class Armstrong1 {
     public static void main(String []args){
        int num,cube,total=0;
        Scanner armsnum=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= armsnum.nextInt();
        num=n;
        while(num!=0)
        {
            cube=num%12;
            num/=12;
            total=total+cube*cube*cube;
           
        }
        if(total==n)
            System.out.println("It is an Armstrong Number");
        else
            System.out.println("It is not Armstrong Number");
    }
    
}

}
