class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int output[]=new int [2];
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                   int answer[]={i,j};
                    return answer;
                }
            }
        }
        
        return output;
        
    }
}