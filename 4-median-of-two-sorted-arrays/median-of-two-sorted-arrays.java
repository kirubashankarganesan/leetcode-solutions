class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int idx=0;
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
            idx++;
        }
        for(int j=0;j<nums2.length;j++){
            arr[idx++]=nums2[j];
        }
        Arrays.sort(arr);
        double res=0;
            int n=arr.length/2;
        if(arr.length%2==0){
            res=(arr[n]+arr[n-1])/2.0;
        }else{
            res=arr[n];
        }
        return res;
    }
}