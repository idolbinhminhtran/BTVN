import java.util.*;
public class Bai7
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        int firstmax = arr[0];
        int indexFisrtMax = 0;
        for(int i = 0; i < n; i++)
        {
            if (firstmax < arr[i])
            {
                firstmax = arr[i];
                indexFisrtMax = i;
            }
        }
        int secondMax = arr[0];
        int indexSecondMax = 0;
        for(int i = 0; i < n; i++)
        {
            if (secondMax < arr[i] && i != indexFisrtMax)
            {
                secondMax = arr[i];
                indexSecondMax = i;
            }
        }

        int maxProduct = firstmax * secondMax;
        System.out.printf("Pair is (%d, %d), Maximum Product: %d", arr[indexFisrtMax], arr[indexSecondMax], maxProduct);



    }
}
