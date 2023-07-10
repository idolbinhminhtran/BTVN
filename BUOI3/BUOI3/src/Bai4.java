import java.util.*;
public class Bai4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] arrArange = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int index = 0;
          for(int i = 0; i < n; i++)
        {
            if (arr[i] < 0)
            {
                arrArange[index++] = arr[i];
            }
        }

        for(int i = 0; i < n; i++)
        {
            if (arr[i] >= 0)
            {
                arrArange[index++] = arr[i];
            }
        }

        for(int i = 0; i < n; i ++)
        {
            System.out.print(arrArange[i] + " ");
        }

    }
}
