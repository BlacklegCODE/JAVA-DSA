//This is a revision type combination of bubble sort, insertion sort and selection sort

import java.util.*;

class first
{
    static void bubble(int arr[])
    {
        int n = arr.length;
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j<n-1-i;i++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    static void selection(int arr[])
    {
        int n = arr.length;

        for(int i =0;i<n;i++)
        {
            int smallest = i;

            for(int j = i+1;j<n;j++)
            {
                if(arr[smallest]<arr[j])
                {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    static void insertion(int arr[])
    {
        int n = arr.length;

        for(int i = 0;i<n;i++)
        {
            int current = arr[i];
            int j = i+1;
            while(j>=0 && current < arr[i])
            {
                arr[j+1] = arr[j];
                j--;
            }
            current = j;
        }
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total elements :");
        int n = sc.nextInt();
        System.out.print("Enter elements :");

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter choice: 1. for bubble,2. for selection, 3. for insertion sort :");
        int x = sc.nextInt();

        switch (x) {
            case 1: bubble(arr);
                break;
            case 2: insertion(arr);
                break;
            case 3: selection(arr);
                break;
        
            default:
                System.out.println("Invalid choice !");
        }
        sc.close();
    }
}
