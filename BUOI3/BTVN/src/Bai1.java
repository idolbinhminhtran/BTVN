import java.util.*;
public class Bai1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang mot: ");
        int n = input.nextInt();
        System.out.println("Nhap so luong phan tu mang hai: ");
        int m = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] common = new int[100];
        System.out.println("Nhap thong tin mang mot: ");
        for(int i = 0; i < n; i ++)
        {
            a[i] = input.nextInt();
        }
        System.out.println("Nhap thong tin mang hai: ");
        for(int i = 0; i < m; i ++)
        {
            b[i] = input.nextInt();
        }
        int i = 0, j = 0;
        int count = 0;
        while (i < a.length)
        {
            if (a[i] == b[j])
            {
                common[count] = a[i];
                count++;
                i++;
                j = 0;
            }
            else
            {
                j++;
                if (j >= b.length)
                {
                    j = 0;
                    i ++;
                }
            }
        }
        System.out.println("So phan tu trung la: ");
        for(int k = 0; k < count; k++)
        {
            System.out.print(common[k] + " ");
        }

    }
}
