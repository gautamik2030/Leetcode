class Solution {
    public int pivotIndex(int[] nums) {
        
        int left=0,right=0;
        int check=-1,i;
        for (i=0;i<nums.length;i++){            
            right+=nums[i];            
        }

        for(i=0;i<nums.length;i++){           
            if(left==right-left-nums[i]) return i;
            left+=nums[i];
        }
        return -1;
    }
   
}