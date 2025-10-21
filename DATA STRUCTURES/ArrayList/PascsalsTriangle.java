import java.util.*;

public class PascsalsTriangle {
    
    public static List<List<Integer>> pascals(int rows){
        List<List<Integer>> triangle = new ArrayList<>();

        if(rows==0) return triangle;
        
        List<Integer> fr = new ArrayList<>();
        fr.add(1);
        triangle.add(fr);

        if(rows==1) return triangle;

        for(int i=1;i<rows;i++){
            List<Integer> newrow = new ArrayList<>();
            newrow.add(1);

            List<Integer> prevrow = triangle.get(i-1);

            for(int j=1;j<i;j++){
                newrow.add(prevrow.get(j)+prevrow.get(j-1));
            }
            newrow.add(1);

            triangle.add(newrow);
        }

        return triangle;
    }

    public static void main(String args[]){
  
        System.out.println(pascals(5));
      
    
    }
}
