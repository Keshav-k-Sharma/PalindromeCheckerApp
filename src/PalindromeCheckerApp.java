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
                //test case 5
                Scanner sc = new Scanner(System.in);
                System.out.println("enter an string:");
                String Msg= sc.nextLine();
                Boolean Palindrome =true;

                char[] chars=Msg.toLowerCase().toCharArray();

                Stack<Character> stack= new Stack<>();
                Queue<Character> queue = new LinkedList<>();

                for (int i=0;i<chars.length;i++){
                        stack.push(chars[i]);
                        queue.add(chars[i]);
                }
                while(!stack.empty() && !queue.isEmpty()){
                        char Stackelement = stack.pop();
                        char QueueElement = queue.remove();
                        if (Stackelement != QueueElement){
                                Palindrome=false;
                        }
                }
                if (Palindrome==true) System.out.println("Palindrome");
                else System.out.println("not palindrome");
        }
}

