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
                //test case 7
                Scanner sc = new Scanner(System.in);
                System.out.println("enter an string:");
                String Msg= sc.nextLine();
                Boolean Palindrome =true;

                char[] chars=Msg.toLowerCase().toCharArray();

                Deque<Character> deque = new ArrayDeque<>();

                for (char i : chars){
                        deque.addFirst(i);
                }


                while(deque.size()>1){
                        char head= deque.removeFirst();
                        char tail =deque.removeLast();
                        if (head != tail){
                                Palindrome=false;
                                break;
                        }
                }

                if (Palindrome==true) System.out.println("Palindrome");
                else System.out.println("not palindrome");
        }
}

