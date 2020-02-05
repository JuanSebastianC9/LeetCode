import java.util.Arrays;
class Solution {
    public int maxCoins(int[] nums) {
        int addNum = 0;
        int[] newNums = {};
        if(nums.length == 1){
            addNum = nums[0];
            return addNum;
        }
        else if(nums.length == 2){
            addNums = (addNums[0] * addNums[1]);
            return addNum + maxCoins(newNums);
        }
        else {
            int minLoc = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[minLoc] > nums[i]){
                    minLoc = i;
            }
            if(minLoc == 0){
               addNum = nums[0] 
            }
            
            return addNum + maxCoins(newNums);
        } 
    }
}