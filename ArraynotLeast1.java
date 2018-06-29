
package acadviewdemo1;
import java.util.Scanner;
public class ArraynotLeast1 {
      public static void main(String args[]){
        int arr[]={1,4,6,7,8,9,10};
        Scanner num=new Scanner(System.in);
        System.out.println("enter the number to be searched:");
        int n=num.nextInt();
        int k;
        boolean flag=false;
        for(k=0;k<arr.length;k++){
            if(n==arr[k])
            {
                System.out.println("Number is present in Array at index:"+k);
                flag=true;
            }
        }
            if(flag==false)
            {
                System.out.println("Number is not present in Array");
            }
    }
}

