package LeetCode;
//Q.26
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int writeIdx = 1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[writeIdx] = nums[i];
                writeIdx++;
            }
        }

        return writeIdx;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2}; //output = [1,2,_]
        System.out.println(removeDuplicates(nums));
    }
}
