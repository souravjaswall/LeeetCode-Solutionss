class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
    int count = 0;
    for(int i=0;i<hours.length;i++) {
        int x = hours[i];
        if(x>=target) {
            count++;
        }
    }
    return count;
    }
}