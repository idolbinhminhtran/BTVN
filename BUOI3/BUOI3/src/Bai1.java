import java.util.*;
public class Bai1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n + 1];
        for(int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }

        int k = input.nextInt();
        for(int j = k; j < n; j++)
        {
            array[j] = array[j + 1];
        }

        for(int i = 0; i < n - 1; i++)
        {
            System.out.print(array[i] + " ");
        }

    }
}
