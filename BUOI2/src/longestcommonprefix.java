import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class longestcommonprefix
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String firstString = input.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = input.nextLine();
        int i = 0;
        int j = 0;
        String commonPrefix = "";
        while (i < firstString.length() && j < secondString.length())
        {
            if(firstString.charAt(i) == secondString.charAt(j))
            {
                commonPrefix += firstString.charAt(i);
                i++;
                j++;
            }
            else
            {
                break;
            }
        }
        if (commonPrefix != "")
        {
            System.out.println("The common prefix is " + commonPrefix);
        }
        else
        {
            System.out.printf("%s and %s has no common prefix", firstString, secondString);
        }

    }


}
