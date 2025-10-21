import java.util.*;
public class Anagram {
    
    public static boolean anagram(String s1,String s2){

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);

            if(hm.get(ch) != null){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }else{
                return false;
            }

        }

        return hm.isEmpty();
    }
    public static void main(String[] args) {

    String s1 = "card";
    String s2 = "racd";

    System.out.println(anagram(s1, s2));

    
    }
}
