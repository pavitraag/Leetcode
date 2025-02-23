class Solution {
    public boolean check(int[] nums) {
        int A[]=nums.clone();
        Arrays.sort(A);
        int n=nums.length;
        for(int x=0;x<n;x++)
        {   boolean match=true;
            for (int i=0;i<n;i++)
            {
                if(nums[i]!=A[(i+x)%A.length])
                {
                    match=false;
                }
            }
            if (match)
            {
                return true;
            }
        }
        return false;
    }
}
