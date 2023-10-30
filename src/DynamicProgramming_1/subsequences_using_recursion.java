package DynamicProgramming_1;

import java.io.*;
import java.util.*;

public class subsequences_using_recursion{

    // Recursive function to print all
// possible subsequences for given array
    public static void printSubsequences(int[] arr, int index,
                                         ArrayList<Integer> path)
    {

        // Print the subsequence when reach
        // the leaf of recursion tree
        if (index == arr.length)
        {

            // Condition to avoid printing
            // empty subsequence
            if (path.size() > 0)
                System.out.println(path);

            return;
        }

            path.add(arr[index]);

        // Subsequence without including
        // the element at current index
        printSubsequences(arr, index + 1, path);


        // Backtrack to remove the recently
        // inserted element
        path.remove(path.size() - 1);


        // Subsequence including the element
            // at current index
            printSubsequences(arr, index + 1, path);



    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 3,1,2};

        // Auxiliary space to store each path
        ArrayList<Integer> path = new ArrayList<>();

        printSubsequences(arr, 0, path);
    }
}

// This code is contributed by Mukul Sharma