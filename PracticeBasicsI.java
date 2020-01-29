import java.util.*;

/**
 * Write a description of class PracticeBasics1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PracticeBasicsI
{
    public static int[] funnyNumbers(int amt, int a, int b)
    {
        int array[] = new int[amt];
        if (a > b){
            for(int i = 0; i < amt; i++)
            {
                array[i] = (int)((Math.random()*( a - b + 1)) + b);
            }
            return array;
        }else{
            for (int i = 0; i < amt; i++)
            {
                array[i] = (int)((Math.random()* (b - a + 1)) + a);
            }
            return array;
        }
    }

    public static ArrayList<Integer> removeDuplicates(int[] arr)
    {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++)
        {
            arrList.add(arr[i]);
        }
        
        for(int i : arrList)
        {
            for (int j : arrList)
            {
                if (arrList.get(i) == arrList.get(j) && j != i)
                {
                    arrList.remove(j);
                    j = arrList.size() - 1;
                }
            }
        }
        return arrList;
    }

    public static double avgNumbers(int[] arr)
    {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return (sum/arr.length);
    }

    public static double avgNumbers(ArrayList<Integer> arr)
    {
        double sum = 0;
        for (int i : arr)
        {
            sum += arr.get(i);
        }
        return (sum/arr.size());
    }

    public static String tWords(String[] arr)
    {
        String fString = "";
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].indexOf("t") != -1)
            {
                fString += arr[i];
            }
        }
        return fString;
    }

    public static void printNums(int [] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
