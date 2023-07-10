import java.util.*;
public class palindrome
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        boolean check = true;
        int i = 0;
        int j = word.length() - 1;
        while (i < word.length() / 2)
        {
            if (word.charAt(i) == word.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                check = false;
                break;
            }
        }


        if (check)
        {
            System.out.println("Is palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}


