class Solution {
    public int countDigits(int num) {
    int digit = 0;
    int temp = num;
    int count = 0;
    if(num<10) {
        return 1;
    }
    while(temp>0) {
        int x = temp % 10;
        temp = temp / 10;
        if(num % x == 0) {
            count++;
        }
    }
    return count;
    }
}