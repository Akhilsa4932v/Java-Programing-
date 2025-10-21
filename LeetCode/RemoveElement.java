package LeetCode;
//Q.27


public class RemoveElement {
 
    public static int dup(int nums[],int val){
        int writeIdx = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                count++;
            }else{
                nums[writeIdx] = nums[i];
                writeIdx++;
            }
        }

        while (writeIdx<nums.length) {
            nums[writeIdx] = -1;
            writeIdx++;
        }
        return nums.length-count;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};  //0 1 3 0 4 _ _ _  no.of unique ele = 5 == count

        System.out.println(dup(nums, 2));

        for(int i=0;i<nums.length;i++){
            if(nums[i] == -1){
                System.out.print('_'+" ");
            }else{
                System.out.print(nums[i]+" ");
            }
        }

        
    }
}