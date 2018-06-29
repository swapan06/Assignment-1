
package acadviewdemo1;
import java.util.Scanner;


public class Occurance {
    public static void main(String[]args){
        Scanner str1=new Scanner(System.in);
        System.out.print("the first String is :");
        String s1=str1.next();
        Scanner str2=new Scanner(System.in);
        System.out.print("the second string is:");
        String s2=str2.next();
        String s3;
        int count=0;
        int line1,line2;
        line1=s1.length();
        line2=s2.length();
        for(int i=0;i<=line1-line2;i++)
        {
            s3=s1.substring(i,i+line2);
        if(s3.equals(s2))
            count++;
    }
    System.out.println(count);
        
    }
}
    
    


