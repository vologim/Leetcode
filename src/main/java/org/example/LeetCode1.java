/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/

package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCode1 {

    public static int[] twoSum(int[] nums, int target) {

        ArrayList<Integer> arrList = IntStream.of(nums)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        for(Integer number : arrList) {
            int result = target - number;
            if(arrList.contains(result)) {
                int index = arrList.indexOf(result);
                int index2 = arrList.lastIndexOf(number);
                if(index != index2) {
                    return new int[]{index, index2};
                }

            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 7};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
