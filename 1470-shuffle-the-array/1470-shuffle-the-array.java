class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int k=0;
        
        for(int i=0;i<nums.length/2;i++){
            ans[k++]=nums[i];
            ans[k++]=nums[i+n];
           
        }
        
        return ans;
    }
}