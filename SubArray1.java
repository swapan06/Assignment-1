
package acadviewdemo1;
public class SubArray1 {
     public static void main(String args[]){
        int arr[]={2,1,3,5,3,7,9,5,8,4};
        int max = 1,min = 1,temp = 0;
        for (int i=1;i<arr.length; i++)
        {
            if(arr[i]>arr[i-1])
                min++;
            else
            {
                if (max < min)
                {
                    max = min;
                    temp = i-max;
                }
              min=1;
            }
        }
                   
    if(max <min)
    {
        max = min;
        temp = arr.length - max;
    }
    
    for(int i = temp; i < max+temp;i++)
    {
    System.out.println(arr[i] + " ");
}
}
    
    
    
    
     
}
