
package acadviewdemo1;
import java.util.Scanner;
public class ArrayWave {
    public static void main(String args[]){
        int temp;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the elements of array=");
        int arr[]=new int [10];
        int j=1;
        int i;
        for(i=0;i<=9;i++)
        {
            arr[i]=num.nextInt();
        }
        for(i=0;i<arr.length;i+=2)
        {
            for( ;j<=9; )
            {
            temp=arr[i];        
            arr[i]=arr[j];
            arr[j]=temp;
            break;
        }
        j+=2;
    }
    for( i=0;i<=9;i++)
    System.out.print(arr[i]+"");
}

}

    
    

