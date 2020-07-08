class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int retValue = -1;
        
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) != null){
                int value = map.get(nums[i]);
                value++;
                map.put(nums[i],value);
            }else{
                map.put(nums[i],1);
            }    
        }
        Set<Integer> set = map.keySet();
        for(Integer i : set){
            if(map.get(i) == 1){
                retValue = i;
                break;
            }
        }
        return retValue;
    }
}
