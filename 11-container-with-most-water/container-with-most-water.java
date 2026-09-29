class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int min=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            min=Math.min(height[left],height[right]);
            int width=right-left;
            int cal=min*width;
            max=Math.max(max,cal);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}