/*
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

package org.example;

import java.util.*;

public class LeetCode13 {
    public int romanToInt(String s) {
        int result = 0;
        List<String> textNumbers = new ArrayList<>();
        char[] str = s.toCharArray();
        for(char sym : str) {
            textNumbers.add(Character.toString(sym));
        }

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("I", 1);
        stringIntegerMap.put("IV", 4);
        stringIntegerMap.put("V", 5);
        stringIntegerMap.put("IX", 9);
        stringIntegerMap.put("X", 10);
        stringIntegerMap.put("XL", 40);
        stringIntegerMap.put("L", 50);
        stringIntegerMap.put("XC", 90);
        stringIntegerMap.put("C", 100);
        stringIntegerMap.put("CD", 400);
        stringIntegerMap.put("D", 500);
        stringIntegerMap.put("CM", 900);
        stringIntegerMap.put("M", 1000);

        ListIterator<String> listIterator = textNumbers.listIterator();

        while(listIterator.hasNext()) {
            String symbol1 = listIterator.next();
            if(listIterator.hasNext()) {
                String symbol2 = listIterator.next();
                if(stringIntegerMap.containsKey(symbol1 + symbol2)) {
                    result += stringIntegerMap.get(symbol1 + symbol2);
                }
                else {
                    result += stringIntegerMap.get(symbol1);
                    listIterator.previous();
                }
            }
            else {
                result += stringIntegerMap.get(symbol1);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        LeetCode13 leetCode13 = new LeetCode13();
        System.out.println(leetCode13.romanToInt("MCMXCIV"));
    }
}
