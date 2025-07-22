class Solution {
    public boolean canAliceWin(int[] nums) {
    int sum = 0;
    int singleDigitSum = 0;
    int doubleDigitSum = 0; 
    for(int i=0;i<nums.length;i++) {
        if(nums[i]<10) {
            singleDigitSum = singleDigitSum + nums[i];
        }
        else {
            doubleDigitSum = doubleDigitSum + nums[i];
        }
    }

    return singleDigitSum != doubleDigitSum;
    }
}