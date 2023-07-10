import java.util.*;
public class Bai2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the specify number: ");
        int n = input.nextInt();
        System.out.println("Enter the number of element in array: ");
        int m = input.nextInt();
        int[] arr = new int[m];
        int[][] pair = new int [100][2];
        System.out.println("Enter the element of array: ");
        for(int i = 0; i < m; i++)
        {
            arr[i] = input.nextInt();
        }
        int count = 0;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if (i == j)
                {
                    continue;
                }
                if (arr[i] + arr[j] == n)
                {
                    System.out.println(arr[i] + " " + arr[j]);
                    pair[count][0] = arr[i];
                    pair[count][1] = arr[j];
                    count ++;
                }
            }
        }
        System.out.println("Pair is: ");
        for(int i = 0; i < count; i++)
        {
            System.out.print(pair[i][0] + " " + pair[i][1]);
            System.out.println();
        }
    }
}
