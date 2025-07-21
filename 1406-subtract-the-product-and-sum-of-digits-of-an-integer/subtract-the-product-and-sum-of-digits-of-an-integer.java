class Solution {
    // this is the solution...
    public int subtractProductAndSum(int n) {
    int product = 1;
    int sum = 0;
    int result = 0;
    while(n>0) {
        int ans = n % 10;
        n = n / 10;
        product = product * ans;
        sum = sum + ans; 
    }

    return product - sum;
    
    }
}