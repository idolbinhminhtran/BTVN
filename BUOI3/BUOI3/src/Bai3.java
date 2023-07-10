import java.util.*;
public class Bai3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] arrConcat = new int[n + m];
        for(int i = 0; i < n; i++)
        {
            arr1[i] = input.nextInt();
        }

        for(int i = 0; i < m; i++)
        {
            arr2[i] = input.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            arrConcat[i] = arr1[i];
        }
        for(int i = 0; i < m; i++)
        {
            arrConcat[n + i] = arr2[i];
        }

        for(int i = 0; i < n + m; i++)
        {
            System.out.print(arrConcat[i] + " ");
        }

    }
}
