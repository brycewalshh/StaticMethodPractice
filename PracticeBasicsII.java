import java.util.*;
/**
 * Write a description of class PracticeBasicsII here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracticeBasicsII
{
    public static int[] sillyNumbers()
    {
        int[] nums = PracticeBasicsI.funnyNumbers(35, 180, 220);
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] *= -1;
            System.out.println(nums[i]);
        }
        return nums;
    }

    public static int[] avgNums(int[] arr)
    {
        int avg = Math.round((float)PracticeBasicsI.avgNumbers(arr));
        arr[0] = avg;
        arr[arr.length - 1] = avg;
        return arr;
    }

    public static void higher(int [] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < arr[arr.length -1])
            {
                arr[i] = 21;
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
    
    public static ArrayList<Integer> oddNums(int [] arr)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        PracticeBasicsI.removeDuplicates(arr);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 != 0)
            {
                nums.add(arr[i]);
            }
        }
        return nums;
    }
}