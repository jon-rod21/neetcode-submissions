class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        
        int r = matrix.length;
        int c = matrix[0].length;
        int right = r * c - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (matrix[mid / c][mid % c] == target)
            {
                return true;
            }

            if (matrix[mid / c][mid % c] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }

         }
         return false;
    }
}
