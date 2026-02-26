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
                //test case 8
                Scanner sc = new Scanner(System.in);
                System.out.println("enter an string:");
                String Msg= sc.nextLine();
                Boolean Palindrome =true;

                char[] chars=Msg.toLowerCase().toCharArray();
                System.out.println(chars);

                LinkedList<Character> first = new LinkedList<>();
                LinkedList<Character> second = new LinkedList<>();


                if (chars.length%2==0) {
                        int mid =chars.length/2;
                        System.out.println(mid);

                        for (int i = 0; i < mid; i++) {
                                first.addFirst(chars[i]);
                        }
                        for (int i = (chars.length) - 1; i >= mid; i--) {
                                second.addFirst(chars[i]);
                        }

                        System.out.println(first);
                        System.out.println(second);
                        for (int i = 0; i < first.size(); i++) {
                                if (first.get(i) != second.get(i)) {
                                        Palindrome = false;
                                }
                        }
                }
                else {
                        int mid =(chars.length/2);
                        System.out.println(mid);

                        for (int i = 0; i < mid; i++) {
                                first.addFirst(chars[i]);
                        }
                        for (int i = (chars.length) - 1; i >mid; i--) {
                                second.addFirst(chars[i]);
                        }
                        System.out.println(first);
                        System.out.println(second);
                        for (int i = 0; i < first.size(); i++) {
                                if (first.get(i) != second.get(i)) {
                                        Palindrome = false;
                                }
                        }
                }
                if (Palindrome==true) System.out.println("Palindrome");
                else System.out.println("not palindrome");
        }
}

