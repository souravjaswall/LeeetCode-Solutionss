class Solution {
    public int differenceOfSum(int[] nums) {
    int elementSum = 0;
    for(int i = 0;i < nums.length; i++) {
        int digit = nums[i];
        elementSum = elementSum + digit;
    }
    int sum = 0;
    for(int i = 0;i < nums.length; i++) {
        int digit = nums[i];
        if(digit>=10){
            int x=0;
            while(digit>0){
                int ans = digit % 10;
                x = x + ans;
                digit = digit / 10;
            }
            sum = sum+x;
        }
        else{
            sum = sum+digit;
        }
    }
    return Math.abs(elementSum-sum);
    }
}