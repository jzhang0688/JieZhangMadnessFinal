package JieZhang;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(JZhangLib.datestr("10/11/18"));            // The user inputs a date in the format mm/dd/yy/.
        System.out.println(JZhangLib.isPalindrome("racecar"));        // The user inputs a word to be tested by the isPalindrome method.
        System.out.println(JZhangLib.sumUpTo(6));                      // The user inputs a number for the sumUpTo method to calculate the sum.
        System.out.println(JZhangLib.multiplicationTable(3,5)); // The user inputs a base and a range to display the multiplicationTable.
        System.out.println(JZhangLib.CutOut("IceCream","ea"));// The user inputs mainstr and a substr to test the CutOut method.
    }
}
