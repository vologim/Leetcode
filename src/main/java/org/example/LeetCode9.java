/*
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LeetCode9 {
    public boolean isPalindrome(int x) {
        List<Integer> numbers = new ArrayList<>();

        if(x < 0) {
            return false;
        }

        int result = x;

        while(true) {
            if(result == 0) {
                break;
            }
            numbers.add(result % 10);
            result = result / 10;
        }

        ListIterator<Integer> list1 = numbers.listIterator();
        ListIterator<Integer> list2 = numbers.listIterator(numbers.size());

        while(true) {
            if(list1.hasNext() && list2.hasPrevious()) {
                if(list1.next() != list2.previous()){
                    return false;
                }
            }
            else {
                return true;
            }

        }
    }

    public static void main(String[] args) {

    }
}
