import java.util.*;

public class Nextgreaterele {
    public static void nextgreater(int arr[]){
        int nxgreater[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            int ele = arr[i];

            if(stack.isEmpty()){
                stack.push(ele);
                nxgreater[i] = -1;
                continue;
            }

            if(stack.peek()>ele){
                nxgreater[i] = stack.peek();
                stack.push(ele);
                continue;
            }

            while(!stack.isEmpty() && stack.peek()<=ele){
                stack.pop();
            }

            if(stack.isEmpty()){
                nxgreater[i] = -1;
            }else{
                nxgreater[i] = stack.peek();
            }
        
            stack.push(ele);
        }
        for(int i=0;i<arr.length;i++){
        
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for(int j=0;j<nxgreater.length;j++){
           
            System.out.print(nxgreater[j]+" ");
    }

}
    public static void main(String args[]){
  
   int arr[] = {4,12,5,3,1,2,5,3,1,2,4,6};  
   nextgreater(arr);  
      
    }
}
