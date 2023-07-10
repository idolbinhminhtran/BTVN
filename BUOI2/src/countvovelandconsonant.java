import java.util.*;
public class countvovelandconsonant
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int vowel = 0;
        int consonant = 0;
        System.out.println("Enter a string: ");
        String word = input.nextLine();
        for(int i = 0; i < word.length(); i ++)
        {
            if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U' || word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
            {
                vowel ++;
            }
            else
            {
                if (word.charAt(i) != ' ')
                {
                    consonant ++;
                }
            }

        }

        System.out.println("The number of vowel " + vowel);
        System.out.println("The number of consonant " + consonant);


    }
}
