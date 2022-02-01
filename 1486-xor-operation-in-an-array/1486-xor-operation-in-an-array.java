class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
int output =0;
for(int i =0;i<n;i++){
output ^= start + (2*i) ;
}
return output;
    }
}