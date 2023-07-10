import java.util.*;
public class Bai8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element of array: ");
        boolean check = true;
        for(int i = 0; i < n; i++)
        {
            a[i] = input.nextInt();
        }
        int flag = 0;
        for(int i = 0; i < n - 1; i++)
        {
            if (a[i] > a[i + 1])
            {
                flag = -1;
                break;
            }
            if (a[i] < a[i + 1])
            {
                flag = 1;
                break;
            }
        }


        if (flag == -1)
        {
            for(int i = 0; i < n - 1; i ++)
            {
                if (a[i] < a[i + 1])
                {
                    check = false;
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    check = false;
                    break;
                }
            }
        }

        if (check)
        {
            System.out.println("This array is sorted");
        }
        else
        {
            System.out.println("This array is not sorted");
        }
    }



}
