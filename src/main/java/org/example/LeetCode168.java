

package org.example;

import java.util.*;

public class LeetCode168 {
    public static String convertToTitle(int columnNumber) {

        final int LETTERS_IN_ALPHABET = 26;

        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        List<Integer> results = new ArrayList<>();
        ListIterator<Integer> listIterator = myMethod(columnNumber, LETTERS_IN_ALPHABET, results).listIterator(results.size());

        StringBuilder stringBuilder = new StringBuilder();

        while(listIterator.hasPrevious()) {
            stringBuilder.append(letters[listIterator.previous()]);
        }

        return stringBuilder.toString();
    }

    private static List<Integer> myMethod(int num, int letters, List<Integer> results) {

        boolean flag = true;
        int result = num;

        while(flag) {
            if(result % letters == 0) {
                results.add(letters - 1);
                result = result / letters;
                if(result == 1) {
                    break;
                }
                continue;
            }
            if(result > letters) {
                results.add(result % letters - 1);
                result = result / letters;
            }
            else {
                results.add(result % letters - 1);
                flag = false;
            }

        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }

}
