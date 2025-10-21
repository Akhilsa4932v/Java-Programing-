package Strings;

import java.util.*;

//Remove characters from the first string which are present in the second string

public class Removechar {

    public static String removeChars(String str1, String str2){
      Set<Character> set = new HashSet<>();
        
        // Store all characters of str2 in a set
        for (char ch : str2.toCharArray()) {
            set.add(ch);
        }
        
        // Build the result string without characters from str2
        
        StringBuilder sb = new StringBuilder();
        for (char ch : str1.toCharArray()) {            //The method toCharArray() is used to convert a string into an array of characters.
            if (!set.contains(ch)) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    
    }
    public static void main(String[] args) {
        String str1 = "gforks";
        String str2 = "ks";
        
        System.out.println(removeChars(str1, str2)); // Output: gfor
      }  
    }

