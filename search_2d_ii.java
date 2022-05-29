/*
    Time Complexity: O(N * log(M))
    Space Complexity: O(1)

    Where 'N' is the number of rows and 'M' is the number of columns in the given matrix.
https://www.codingninjas.com/codestudio/problems/search-in-a-2d-matrix-ii_1089637?leftPanelTab=2
*/
approch1 
import java.util.ArrayList;

public class Solution 
{
    public static boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr) 
    {
        int n = arr.size();
        int m = arr.get(0).size();

        //    Iterate through the rows.
        for (int i = 0; i < n; i++) 
        {
            
            //    Do a binary search
            int low = 0, high = m - 1;

            while (low <= high) 
            {
                int mid = (low + high) / 2;

                //    Element found
                if (arr.get(i).get(mid) == x) 
                {
                    return true;
                }
                
                //    Reduce the search space
                else if (arr.get(i).get(mid) > x) 
                {
                    high = mid - 1;
                }
                
                //    Reduce the search space
                else 
                {
                    low = mid + 1;
                }
            }
        }

        //    Element is not present in the matrix.
        return false;
    }
}



@@@@@@@@@@@@@@@@@@
/*
    Time Complexity: O(N + M)
    Space Complexity: O(1)

    Where 'N' is the number of rows and 'M' is the number of columns in the given matrix.

*/

import java.util.ArrayList;

public class Solution 
{

    public static boolean findInMatrix(int x, ArrayList<ArrayList<Integer>> arr) 
    {
        int n = arr.size();
        int m = arr.get(0).size();

        //    Initialize the two pointers.
        int i = 0, j = m - 1;

        while (i < n && j >= 0) 
        {
            
            //    Element found.
            if (arr.get(i).get(j) == x) 
            {
                return true;
            }
            
            //    Eliminate the current column.
            else if (arr.get(i).get(j) > x) 
            {
                j--;
            }
            
            //    Eliminate the current row.
            else
            {
                i++;
            }
        }

        //    Element is not present in the matrix.
        return false;
    }
}
