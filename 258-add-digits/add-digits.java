class Solution {
    public int addDigits(int num) {
        int x= 0;
        if(num==0) return 0;
        if(num<10) return num;
        else if(num%9==0){
            return 9;
        }
        else if(num%9!=0){
            return num%9;
        }
        return x;
    }
}