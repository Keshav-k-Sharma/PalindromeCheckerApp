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
                //test case 3
                Scanner sc = new Scanner(System.in);
                System.out.println("enter an string:");
                Boolean Palindrome =false;
                String Msg= sc.nextLine();
                for(int i=0; i< Msg.length()/2;i++){
                        if(Msg.toLowerCase().charAt(i)==Msg.toLowerCase().charAt(Msg.length()-1-i)){
                                 Palindrome = true;
                        }
                }
                if (Palindrome==true) System.out.println("Palindrome");
                else System.out.println("not palindrome");
        }
}

