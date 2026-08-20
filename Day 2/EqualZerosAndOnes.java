class EqualZeroesAndOnes{
    public static void main(String[] args){
        int n =8;
        int[] nums = {0,1,0,1,1,1,0,0};
        int length = 0,zero=0,one=0;
        int left=0,right=0;
        while(right<n){
            if(zero == one){
                length = Math.max(length,right-left);
            }
            if(nums[right]==0) zero++;
            if(nums[right-1]==1) one++;
        }
    }
}