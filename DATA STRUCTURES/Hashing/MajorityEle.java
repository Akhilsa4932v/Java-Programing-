import java.util.*;
public class MajorityEle {
    public static void main(String[] args) {

        int arr[] = {1,3,2,5,3,3,1,5,3};
  
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }

        for(int key:hm.keySet()){
            if(hm.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    //   for(int i=0;i<arr.length;i++){
    //     if(hm.containsKey(arr[i])){
    //         hm.put(arr[i],hm.get(arr[i])+1);
    //     }else{
    //         hm.put(arr[i],1);
    //     }
    //   }

    //     for (int key : hm.keySet()) {
    //         if(hm.get(key) > arr.length/3){

    //             System.out.println(key);
    //         }
    //     }



    
    }
}
