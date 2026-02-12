class Solution {
    public int singleNonDuplicate(int[] nums) {
        int y = 0;

        for (int i = 0; i < nums.length; i++) {
            y = y ^ nums[i];
        }

        return y;
    }
}
