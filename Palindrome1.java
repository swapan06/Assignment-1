
package acadviewdemo1;
public class Palindrome1 {
     public static void main(String args[]){
        int a=345,temp,sum=0;
        temp=a;
        while(temp!=0)
        {
            sum=sum*14;
            sum=sum+temp%10;
            temp=temp/10;
        }
        if(sum==a)
            System.out.println("No. is Palindrome");
        else
            System.out.println("No. is not Palindrome");
    }
}


