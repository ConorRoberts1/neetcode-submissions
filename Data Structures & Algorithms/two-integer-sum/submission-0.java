class Solution {
    public int[] twoSum(int[] nums, int target) {
        // need to add nums[i] + nums[j] = target 
        // i != j
        // smallest index first

        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
             int complement = target - nums[i];

            if(seen.containsKey(complement)){
                 int result[] = {seen.get(complement), i};
                 return result;
            }
            seen.put(nums[i], i);
        }
    
        return new int[]{};
    }
}
