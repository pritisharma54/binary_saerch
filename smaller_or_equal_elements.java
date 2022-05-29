public class Solution {
    public int solve(ArrayList<Integer> arr, int key) {
      if (key > arr.get(arr.size() - 1)) // if the 'key' is bigger than the biggest element
      return -1;

    int start = 0, end = arr.size() - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (key < arr.get(mid)) {
        end = mid - 1;
      } else if (key >= arr.get(mid)) {
        start = mid + 1;
      }
    }

    //this works as this function returns index of next greater element then key-> which is what we need,all elements less than this element lie at lower indexs,last lower index+1 is our answer
    // since the loop is running until 'start <= end', so at the end of the while loop, 'start == end+1'
    // we are not able to find the element in the given array, so the next big number will be arr[start]
    return start;
    }
}
