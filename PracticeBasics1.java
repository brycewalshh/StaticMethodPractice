import java.util.*;
/**
 * Write a description of class PracticeBasics1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracticeBasics1
{
    public static double avg(int[] arr)
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return (sum/arr.length);
    }
    public static double avg(ArrayList<Integer> arr)
    {
        double sum = 0;
        for (int i : arr)
        {
            sum += arr.get(i);
        }
        return (sum/arr.size());
    }
}
