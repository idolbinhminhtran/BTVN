import java.util.*;
public class Bai4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in array: ");
        int n = input.nextInt();
        int odd = 0, even = 0;
        int[] arr = new int[n];
        System.out.println("Enter the element of array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if (arr[i] % 2 == 0)
            {
                even ++;
            }
            else
            {
                odd ++;
            }
        }
        System.out.println("The number of odd element is: " + odd);
        System.out.println("The number of even element is: " + even);

    }
}
