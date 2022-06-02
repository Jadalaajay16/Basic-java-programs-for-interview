package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumDeletionToUniqueChars {

    public int minDeletes(String input){

        //count all chars count and store it in array of 26 chars
        Integer [] charCounts = new Integer[26];
        Arrays.fill(charCounts, 0);

        for (int i = 0; i <input.length() ; i++) {
            int index = input.charAt(i)-'a';
            int count = charCounts[index];
            charCounts[index] = count + 1;
        }

        //create list of counts
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<charCounts.length ; i++) {
            if(charCounts[i]>0)
                list.add(charCounts[i]);
        }

        //cort the array list in descending order
        Collections.sort(list, Collections.reverseOrder());

        Integer[] counts = list.toArray(new Integer[list.size()]);

        int deletions=0;
        //iterate from left to right and if count is same then reduce
        for (int i = 0; i <counts.length-1 ; i++) {
            for (int j = i+1; j <counts.length ; j++) {
                if (counts[i]>0 && counts[i]==counts[j]){
                    int count = counts[j];
                    counts[j] = count - 1;
                    deletions++;
                }else
                    break;
            }
        }
        return deletions;
    }

    public static void main(String[] args) {
        MinimumDeletionToUniqueChars m = new MinimumDeletionToUniqueChars();
        String input="example";
        System.out.println(m.minDeletes(input));
        input="aaabbb";
        m.minDeletes(input);
        input="abcaabbcdaab";
        m.minDeletes(input);
        input="aaaabbbbccccdddd";
        m.minDeletes(input);
    }
}