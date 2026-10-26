import java.util.Scanner;
class Main
{
    static int stack[] = new int[50];
    static int top = -1;

    public static void push(int ch)
    {
        stack[++top] = ch;
    }
    public static int pop()
    {
        return stack[top--];
    }
    public static void main(String[] args) {
        int rem, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit to convert to binary :");
        n = sc.nextInt();

        while(n > 0)
        {
            rem = n % 2;
            push(rem);
            n = n/2;
        }
        while(top != -1)
        {
            System.out.print(pop() + " ");
        }
    }
}
