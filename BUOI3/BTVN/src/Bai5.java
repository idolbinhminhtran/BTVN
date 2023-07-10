import java.util.*;

public class Bai5
{
    public static int findMax(int[] arr)
    {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMin(int[] arr)
    {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in array: ");
        int n = input.nextInt();
        System.out.println("Enter the element of array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        boolean[] check = new boolean[n];
        Arrays.fill(check, true);
        for(int i = 0; i < n; i++)
        {
            if (arr[i] == findMin(arr) || arr[i] == findMax(arr))
            {
                check[i] = false;
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if (check[i] == true)
            {
                sum += arr[i];
            }
        }
        double average = (double) sum / (double) (n - 2);
        System.out.println("The average value without largest and smallest value is: " + average);



    }
}
