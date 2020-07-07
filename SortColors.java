class Solution {
    public void sortColors(int[] nums) {
        int startIndex=0;
        int midIndex=0;
        int endIndex=nums.length-1;
        int temp;
        while(midIndex<=endIndex){
            if(nums[midIndex]==0){
                temp = nums[midIndex];
                nums[midIndex] = nums[startIndex];
                nums[startIndex]=temp;
                midIndex++;
                startIndex++;
            }else if(nums[midIndex]==1){
                midIndex++;
            }else if(nums[midIndex]==2){
                temp=nums[midIndex];
                nums[midIndex]=nums[endIndex];
                nums[endIndex]=temp;
                endIndex--;
            }
            
        }
        
    }
}
