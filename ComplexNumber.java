
package acadviewdemo1;
public class ComplexNumber {
    public static void main(String args[]){
        ComplexNumber complex=new ComplexNumber(8,5);
        complex.displayNumber();
    }
    int real;
    int imaginary;
    ComplexNumber(int a,int b)
    {
        this.real=a;
        this.imaginary=b;
    }
    public void displayNumber()
    {
        System.out.println("ComplexNumber is:"+real+"+i"+imaginary);
    }
    
    
    
}
    }
    
}
