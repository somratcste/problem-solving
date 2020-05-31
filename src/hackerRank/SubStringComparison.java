package hackerRank;

import java.util.*;

public class SubStringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        SortedSet<String> set = new TreeSet<String>();

        for(int i=0; i<s.length() - 1; i++) {
            if(i+k > s.length()) {
                continue;
            }
            set.add(s.substring(i, i+k));
        }

        smallest = set.first();
        largest = set.last();

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
