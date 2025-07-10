class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1, high =0;
        for(int pile : piles)
        {
            high=(pile>high)?pile:high;
        }
        int result =high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int hours=0;
            for(int pile: piles)
            {
                hours+= Math.ceil((double)pile/mid);
            }
            if(hours<=h)
            {
                result=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return result;
    }
}