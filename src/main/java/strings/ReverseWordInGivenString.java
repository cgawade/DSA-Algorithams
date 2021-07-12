package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i


Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr


 */
public class ReverseWordInGivenString {
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        //reverseWords(str);
        reverseWordsV1(str);
    }

    private static void reverseWords(String s) {
        String[] split = s.split("\\.");
        int start = 0;
        int end = split.length-1;

        while (start < end){
            swap(split, start, end);
            start++;
            end--;
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if (i == split.length-1)
                builder.append(split[i]);
            else
                builder.append(split[i]+".");
        }

        System.out.println(builder.toString());
    }

    private static void reverseWordsV1(String s) {

        String[] split = s.split("\\.");
        int start = 0;
        int end = split.length-1;

        while (start < end){
            swap(split, start, end);
            start++;
            end--;
        }

        String collect = Arrays.stream(split).collect(Collectors.joining("."));
        System.out.println(collect);
    }


    private static void swap(String[] split, int start, int end) {
        String temp = split[start];
        split[start] = split[end];
        split[end] = temp;
    }
}
