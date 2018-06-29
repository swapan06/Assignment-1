
package acadviewdemo1;
import java.util.Scanner;

public class Vowels {
    public static void main(String[]args){
        Scanner val=new Scanner(System.in);
        System.out.print("enter the String:");
        String str1=val.next();
        String str2=str1.replaceAll("aeiouAEIOU","");
        System.out.println("String without vowels:"+str2);
        
    }
    
}
