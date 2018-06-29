
package acadviewdemo1;


public class WordCount2 {
    public static void main(String args[]){
      int i;
      String str="I Don't Fear To Die";
      System.out.println("the sentence is :"+str);
   int count=1;
      for(i=0;i<=str.length()-1;i++){
          if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
          {
              count++;
              
          }
      }
      System.out.println("the number of word in sentence"+ count);
  }
    
}

    
   

