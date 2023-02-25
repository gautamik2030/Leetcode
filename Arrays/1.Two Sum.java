class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int end = nums.length;
        for (i=0;i<end;i++){
            for (j=i+1;j<end;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
