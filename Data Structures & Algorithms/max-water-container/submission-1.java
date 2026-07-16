class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int ptrOne = 0;
        int ptrTwo = heights.length-1;
        while(ptrOne<ptrTwo){
            if(heights[ptrOne]<=heights[ptrTwo]){
                int currArea = heights[ptrOne]*(ptrTwo-ptrOne);
                if(currArea>maxArea){
                    maxArea = currArea;
                }
                ptrOne+=1;
            }else if(heights[ptrOne]>heights[ptrTwo]){
                int currArea = heights[ptrTwo]*(ptrTwo-ptrOne);
                if(currArea>maxArea){
                    maxArea = currArea;
                }
                ptrTwo-=1;
            }
        }
        return maxArea;
    }
}
