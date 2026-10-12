import java.util.Stack;
class stack
{
    public static void main(String[] args)
        {
            Stack<Integer> n = new Stack<>();

           for(int i = 0;i<50;i++)
           {
                if(i%2 == 0)
                {
                    n.push(i);
                }
           }
           System.out.println(n.pop());
           System.out.println(n.peek());
        }
}
