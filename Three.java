import java.util.*;
 
public class Three {
      static boolean isPalindrome(int n)
        {
             
            int reverse = 0;
            int temp = n;
            while(temp>0) {
                reverse = reverse*10 + temp%10;
                temp = temp/10;
            }
           if(n==reverse)return true;
           return false;
        }
       
        public static void main(String args[])
        {
            int n1 = 2552; {
                if(isPalindrome(n1)) {
                    System.out.print(n1 + " ");
                }
            }
     
        }
}