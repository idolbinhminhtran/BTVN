import java.util.*;
public class Bai3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element in first array: ");
        int n = input.nextInt();
        System.out.println("Enter the number of element in second array: ");
        int m = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        boolean check = true;
        if (n != m)
        {
            check = false;
        }
        else
        {
            System.out.println("Enter element of first array: ");
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
            }
            System.out.println("Enter element of second array: ");
            for (int i = 0; i < n; i++) {
                b[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    check = false;
                    break;
                }
            }
        }

        if(check)
        {
            System.out.println("Two array equal");
        }
        else
            System.out.println("Two array not equal");
    }

}
