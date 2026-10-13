import java.util.Stack;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.println("1.Push,2.POP,3.PEEK,4.EXIT");
        int ch = sc.nextInt();
        int n = 1;
        switch(ch)
            {
                case 1:
                    System.out.println("Enter how many elements to push :");
                    int a = sc.nextInt();
                    for(int i = 0;i<a;i++)
                    {
                        System.out.print("Enter element " + i+ ":");
                        int b = sc.nextInt();
                        s.push(b);
                    }
                case 2:
                    System.out.println("Enter how many elements to pop :");
                    int b = sc.nextInt();
                    for(int i = 0;i<b;i++)
                    {
                        s.pop();
                    }
                case 3:
                    System.out.println("Top element currently :" + s.peek());

                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            n++;
        }
    }
