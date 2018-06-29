package acadviewdemo1;
import java.util.Scanner;
public class ReverseS {
      public static void main(String args[]){
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the value of N = ");
        int n= number.nextInt();
        int num=n,reversed=0;
        while(num!=0)
                {
                    int digit=num%10;
                    reversed= reversed*10+digit;
                    num/=10;
                }
        System.out.println("reversed number:"+reversed);
                    
                }
    }
    
    



