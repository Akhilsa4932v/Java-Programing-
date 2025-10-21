
public class pyramid{
    
    public static int sumup(int n){
        int totalSum = 0;

        for(int row=1;row<=n;row++){

            int rowSum =  0;

            for(int i=row;i>=1;i--){
                rowSum += i;
            }

            for(int j=2;j<=row;j++){
                rowSum += j;
            }

            totalSum += rowSum;

        }

        return totalSum;
    }
  
public static void main(String []args){
 
    System.out.println("sum of 3 rows :"+sumup(3));
}
    
}