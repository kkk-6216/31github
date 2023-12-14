class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int[] row = new int[grid.length];
        int[] column = new int[grid[0].length];

        for(int i = 0; i < row.length; i++) {
            int count = 0;
            for(int j = 0; j < column.length; j++) {
                count = count + grid[i][j];
            }
            row[i] = 2*count - column.length;
        }

        for(int i = 0; i < column.length; i++) {
            int count = 0;
            for(int j = 0; j < row.length; j++) {
                count = count + grid[j][i];
            }
            column[i] = 2*count - row.length;
        }

        for(int i = 0; i < row.length; i++) {
            for(int j = 0; j < column.length; j++) {
                grid[i][j] = row[i] + column[j];
            }
        }

        return grid;
    }
    
}
