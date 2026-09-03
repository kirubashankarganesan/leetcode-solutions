class Solution {
    public void moveZeroes(int[] arr) {
        int nz=0;
        int z=0;
        while(z<arr.length){
            if(arr[z]==0){
                z++;
            }else{
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                z++;
                nz++;
            }
        }
    }
}