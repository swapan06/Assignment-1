
package acadviewdemo1;
public class Primeno {
    public static void main(String args[]){
        int a=15;
               
        int i;
        int b=0;
        for(i=2;i<a/2;i++)
        {
            if(a%i==0)
            {
                System.out.println("not prime");
            b=1;
            
        }
        }
    if(b==0)
    {
        System.out.println("prime number");
    }
   
    }
}
    


            
     