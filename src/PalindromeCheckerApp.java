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
                String Msg="madam";
                Msg=Msg.toLowerCase();
                String Reverse = "";
                char[] chars = Msg.toCharArray();
                for (int i=0; i< Msg.length();i++) {
                        Reverse += chars[i];
                }
                if (Reverse.equals(Msg)){
                        System.out.println("Palindrome");
                }
                else{
                        System.out.println("not palindrome");
                }

        }
}

