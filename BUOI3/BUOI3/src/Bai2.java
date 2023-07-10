import java.util.*;
public class Bai2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 0; i < n; i ++)
        {
            arr[i] = input.nextInt();
        }
        int k = input.nextInt();
        for(int i = n; i > k; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[k] = -1;
        for(int i = 0; i <= n; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
