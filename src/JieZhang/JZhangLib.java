package JieZhang;

public class JZhangLib {

    public static String datestr(String input)           // The user inputs a date in the format of mm/dd/yy.
    {                                                    // The datestr  method changes the format to dd-mm-yy.
        String day = input.substring(3,5);               // By switching the position of the day and the month.
        String month = input. substring (0,2);           // Then replaces / with -.
        String year = input.substring(6);
        return day + "-" + month + "-" + year;
    }

    public static String isPalindrome(String word)       // The user inputs a word.
    {                                                    // The isPalindrome method first rearrange the word character
        int i = word.length();                           // by character backward, then compares the original word to
        String backward = "";                            // "backward". If they are the same, the word is a palindrome.
        while (i > 0)
        {
           backward = backward + word.substring(i-1,i);
           i--;
        }
        if (word.compareTo(backward) == 0)
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }

    public static int sumUpTo (int num)                  // The user inputs a number
    {                                                    // The sumUpTo method returns the sum of the number entered
        int sum = 0;                                     // and all its previous integers starting from 0.
        while (num > 0)
        {
           sum = sum + num;
           num--;
        }
        return sum;
    }

    public static String multiplicationTable (int base, int range)    // The user inputs a base and a range.
    {                                                                 // The multiplicationTable method displays the
        String output = "";                                           // base*n for n = all integers from 0 to range.
        while (range >= 0)
        {
            output = base*range + " " + output;
            range --;

        }
        return output;
    }

    public static String CutOut(String mainstr, String substr)        // The user inputs a mainstr and a substr.
    {                                                                 // The CutOut method returns the mainstr with the
        int cut = 0;                                                  // first occurrence of the substr removed.
        cut = mainstr.indexOf(substr);
        return mainstr.substring(0,cut) + mainstr.substring(cut+substr.length());
    }
}
