import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] a;
        a = new int[10];
        int[] b= {1, 2, 3, 4, 5};
        for(int i = 0; i < 10; i++)
        {
            a[i] = input.nextInt();
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}