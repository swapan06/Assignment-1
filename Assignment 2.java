Que:1 Check if given year is leap year or not?
Ans:1
public class LeapYear {
    
  public static void main(String args[]){
    int a=2015;
    int b=a%4;
    if(b==0)
    {
        System.out.println("It is a Leap year");
    }
    else
    {
        System.out.println("It is not a Leap year");
    }
    }
    }

Que:2 Print the Pattern?
Ans:2
package acadviewdemo1;
public class Pattern1 { public static void main(String args[]){
        int t,k;
        for(t=1;t<=4;t++)
        {
            for(k=1;k<=t;k++)
            {
                System.out.print("*");
            }
                
            System.out.println("");
        }
            }
}

Que:3 W.A.P of java to find the biggest number among three numbers?
Ans:3

package acadviewdemo1;
public class Threeno1 {
     public static void main(String args[])
    {
int a=78,b=44,c=23;

if (a>b&&a>c)
System.out.println(a+" is Greater");
else
{
if(b>a&&b>c)
System.out.println(b+" is Greater");
else
    System.out.println(c+" is Greater");
}
}
}

Que:4 Check if a number N is a Palindrome or not?
Ans:4
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


Que:5 Check if a number is prime or not?
Ans:5
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
    
Que:6 Find the reverse of a number N?
Ans:6
package acadviewdemo1;
public class ReverseNumber {
    public static void main(String args[]){
        int num=1234567,reversed=0;
        for(;num !=0;num/=10){
            int digit =num % 10;
            reversed=reversed*10+digit;
            
        }
        System.out.println("Reversed Number:"+ reversed);
        
    }
    
}

            
     
    

