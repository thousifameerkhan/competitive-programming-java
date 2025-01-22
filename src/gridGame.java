public class gridGame {


    public long[] sumOfElements(int[][] grid,int col_count)
    {
        long[] ans = new long[2];

        for(int i=0;i<col_count;i++)
        {
           // ans[0] = ans[0] + (long) grid[0][i];
            ans[1] = ans[1] + (long) grid[1][i];
        }

        return ans;
    }

    public int[][] gridModify(int[][] grid, int jump_index)
    {
        for(int i=0;i<=jump_index;i++)
        {
            grid[0][i] = 0;
        }
        for(int i=jump_index;i<grid[0].length;i++)
        {
            grid[1][i] = 0;
        }
        return grid;
    }

    public long gridGame(int[][] grid) {

        long[] sum = gridGame_max(grid);;

        int max_index = (int)sum[1];
        grid = gridModify(grid,max_index);
        long[] sum1 = gridGame_max(grid);

        return sum1[0];

    }

    public long[] gridGame_max(int[][] grid) {

        long[] max_ans = new long[2];
        long result =0;
        int col_count = grid[0].length;
        long[] sum = sumOfElements(grid,col_count);;
        long max = 0;
        long sum1,sum2;
        sum1 = 0;
        sum2 = sum[1];
        int maxindex=0;

        for(int i=0;i<col_count;i++)
        {
            if(i==0)
                sum1 = (long) grid[0][0];
            else
            {
                sum1 = sum1 + (long)grid[0][i];
                sum2 = sum2 - (long)grid[1][i-1];
            }
            if( max < sum1 + sum2 )
            {
                max = sum1 + sum2;
                maxindex = i;
            }
        }

        max_ans[0] = max;
        max_ans[1] = (long)maxindex;;
        return max_ans;
    }


}
