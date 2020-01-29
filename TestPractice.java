import java.util.*;

public class TestPractice

{

    public static void main(String args[])

    {

        // #1 - Creates an array of numbers and then changes it

        // to an array of its negatives

        int [] numbers1 = PracticeBasicsII.sillyNumbers();

        System.out.println();

        //#2 - Creates an arraylist of integers from numbers1

        // by removing duplicates and then prints out the arraylist

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();

        numbers2 = PracticeBasicsI.removeDuplicates(numbers1);

        System.out.println("The array as an arraylist without duplicates is " +numbers2);

        System.out.println();

        //#3 - Takes the average of the array of numbers and puts

        // the average into the 1st and last position in the array

        PracticeBasicsII.avgNums(numbers1);

        //#4 - Call the static method printNums to print the new array

        System.out.println("The average of the array in the 1st and last position ");

        PracticeBasicsI.printNums(numbers1);

        System.out.println();

        //#5 - higher replaces every int that is smaller than the element

        // in the last element in the array with 21 then prints the sum of

        // the elements in the array

        System.out.println("This is the sum of the elements in the array: ");

        PracticeBasicsII.higher(numbers1);

        System.out.println();

        //#6 - print the new array of numbers1

        System.out.println("The array with elements replaced by 21 is ");

        PracticeBasicsI.printNums(numbers1);

        System.out.println();

        //#7 - pass in array numbers1 and returns only the odd numbers

        // into an arraylist called numbers2

        numbers2 = PracticeBasicsII.oddNums(numbers1);

        //#8 - print the arraylist

        System.out.println("The arraylist of odd numbers only is " +numbers2);

        System.out.println();

        //#9 - print the average in numbers2 using avgNumbers();

        System.out.println("The average of the arrayList is " +PracticeBasicsI.avgNumbers(numbers2));

        //#10 - Create a String array with some words that contain a t and call tWords

        String [] words = {"hello", "goodbye", "today", "tomorrow", "yesterday"};

        System.out.println(PracticeBasicsI.tWords(words));

    }

}