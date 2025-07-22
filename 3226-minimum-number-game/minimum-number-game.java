class Solution {
    public int[] numberGame(int[] nums) {
    Arrays.sort(nums);
    int[] arr = new int[nums.length];
    int index = 0;
    for(int i=0;i<nums.length;i=i+2) {
        int alice = nums[i];
        int bob = nums[i+1];
        arr[index++] = bob;
        arr[index++] = alice;
    }
    return arr;
    }
}