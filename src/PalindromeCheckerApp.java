/*
UC1
@author Keshav Krishan Sharma
@version 1.0
*/
import java.util.*;
public class PalindromeCheckerApp{
        public static void main(String[] args){
                System.out.println("WELCOME TO Palindrome checker Management System");
                System.out.println("Version :1.0");
                System.out.println("System initiaised "+ "successfully");
                //test case 4
                Scanner sc = new Scanner(System.in);
                System.out.println("enter an string:");
                String Msg= sc.nextLine();
                Boolean Palindrome =true;
                char[] chars =Msg.toLowerCase().toCharArray();
                int start =0;
                int end = chars.length-1;
                while (start <chars.length && end>0){
                        if( chars[start]!=chars[end]){
                                Palindrome= false;
                        }
                        start++;
                        end--;
                }
                if (Palindrome==true) System.out.println("Palindrome");
                else System.out.println("not palindrome");
        }
}

