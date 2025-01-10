class Solution {
    public int[] twoSum(int[] nums, int target) {
          HashMap<Integer, Integer> data = new HashMap<>();
        int[] myIntArray = new int[2];
        for(int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if(data.containsKey(val)){
                myIntArray[0] = data.get(val);
                myIntArray[1] = i;
                return myIntArray;
            }
            data.put(nums[i], i);
        }
        return myIntArray;
    }
}