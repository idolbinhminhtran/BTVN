import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        String xReverse = "";

        for(int i = x.length() - 1; i >= 0; i--)
        {
            xReverse += x.charAt(i);
        }

        System.out.println(xReverse);

    }
}