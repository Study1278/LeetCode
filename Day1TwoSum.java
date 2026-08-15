class Day1Sum1D {
    public int[] sum1d(int[] nums){
        for (int i=1; i<nums.length; i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}