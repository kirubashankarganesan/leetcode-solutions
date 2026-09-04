class Solution {
    public int removeElement(int[] nums, int val) {
        int st=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[st]=nums[i];
                st++;
            }
        }
        return st;
    }
}