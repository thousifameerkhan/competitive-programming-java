import java.util.HashMap;
import java.util.Map;

public class Array2DVisit {


    class arrayIndices
    {
        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        private int row;

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        private int column;



        public arrayIndices(int row,int column)
        {   this.row = row;
            this.column = column;
        }

    }
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int result = 0;
        int row_count = mat.length;
        int col_count = mat[0].length;
        Map<Integer, arrayIndices> hm = new HashMap<Integer, arrayIndices>(row_count * col_count);

        for(int i = 0 ; i<row_count;i++){
            for(int j = 0 ; j<col_count;j++){
                    arrayIndices a1  = new arrayIndices(i,j);
                    //System.out.println("hm "+mat[i][j]);
                    hm.put(mat[i][j],a1);
            }
        }

        int[] row_freq = new int[row_count];
        int[] col_freq = new int[col_count];

        for(int k = 0;k<arr.length;k++)
        {
            int row_num = hm.get(arr[k]).getRow();
            int col_num = hm.get(arr[k]).getColumn();
            row_freq[row_num]++;
            col_freq[col_num]++;
            if( (row_freq[row_num] == row_count) || (col_freq[col_num] == col_count))
            {
                result = k;
                break;
            }

        }

//
//        for (int i: hm.keySet()) {
//            System.out.println("value : "+i);
//            System.out.println("row : "+hm.get(i).getRow());
//            System.out.println("column : "+hm.get(i).getColumn());
//        }



     return result;
    }
public String helloWorld()
{
    return "HelloWorld from 2d_array";
}




}
