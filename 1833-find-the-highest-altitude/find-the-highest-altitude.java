class Solution {
    public int largestAltitude(int[] gain) {
        int current=0;
        int maxAltitude=0;
        for (int i=0;i<gain.length;i++){
            current=current+gain[i];
            if(current>maxAltitude){
                maxAltitude=current;
            }
        }
        return maxAltitude;
    }
}