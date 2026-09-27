import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

class first
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Float> list2 = new ArrayList<Float>();
        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<Boolean> list4 = new ArrayList<Boolean>();

        System.out.println("How many elements do you need ? :");
        int n = sc.nextInt();
        
        //adding elements using for loop
        for(int i = 0;i<n;i++)
        {
            int x = sc.nextInt();
            list.add(x);
        }
        System.out.println("Getting entered elements now :");

        //getting elements using for loop
        for(int i = 0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
System.out.println();
        //deleting elements in ArrayList
        list.remove(2);
        System.out.println("Array after removal :");
        for(int i = 0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
System.out.println();
        //adding element at dedicated index number:
        list.add(2,67);
        System.out.println("Array after manipulation :");
        for(int i = 0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
