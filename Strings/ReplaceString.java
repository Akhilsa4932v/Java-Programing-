package Strings;

import java.util.*;

public class ReplaceString {



    public static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) {
        // Store valid replacements in a sorted list (sorted by index)
        List<int[]> replacements = new ArrayList<>();
        
        for (int j = 0; j < Q; j++) {
            int i = index[j];
            if (S.startsWith(sources[j], i)) { // Check if source matches at index i
                replacements.add(new int[]{i, j});
            }
        }
        
        // Sort replacements by index in descending order to avoid shifting issues
        replacements.sort((a, b) -> Integer.compare(b[0], a[0]));
        
        // Perform replacements
        StringBuilder sb = new StringBuilder(S);
        for (int[] rep : replacements) {
            int i = rep[0], j = rep[1];
            sb.replace(i, i + sources[j].length(), targets[j]);
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String S = "gforks";
        int Q = 2;
        int[] index = {0, 4};
        String[] sources = {"g", "ks"};
        String[] targets = {"geeks", "geeks"};
        
        System.out.println(findAndReplace(S, Q, index, sources, targets)); // Output: geeksforgeeks
    }
}


