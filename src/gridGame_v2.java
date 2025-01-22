public class gridGame_v2 {


    public long[] sumOfElements(int[][] grid,int col_count)
    {
        long[] ans = new long[2];

        for(int i=0;i<col_count;i++)
        {
            ans[0] = ans[0] + (long) grid[0][i];
            ans[1] = ans[1] + (long) grid[1][i];
        }

        return ans;
    }

    public long gridGame(int[][] grid) {

        int col_count = grid[0].length;
        long[] sum = sumOfElements(grid,col_count);;
        long sum1,sum2,second_row_sum;
        sum1 = sum[0];
        sum2 = 0;
        second_row_sum = sum[1];
        long max = 999999999;

        for(int i=0;i<col_count;i++)
        {
            long k1,k2;
            if(i==0)
            {
                sum1 = sum1-grid[0][0];
                sum2 = 0;
            }
            else{
                sum1 = sum1-grid[0][i];
                sum2 = sum2 + grid[1][i-1];
            }
            max = Math.min(max,Math.max(sum1,sum2));
        }
        return max;
    }





}
