class SpecialPositionsInABinaryMatrix {
    public int numSpecial(int[][] mat) {
        int count = 0;

        first:for(int i = 0; i < mat.length; i++) {
            second:for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1) {

                    int icopy = i-1;
                    int jcopy = j-1;
                    
                    while(icopy >= 0 ) {
                        if(mat[icopy][j] == 1) {
                            break second;
                        }
                        icopy--;
                    }
                    icopy = i+1;
                    while(icopy < mat.length ) {
                        if(mat[icopy][j] == 1) {
                            break second;
                        }
                        icopy++;
                    }
                    
                    while(jcopy >= 0 ) {
                        if(mat[i][jcopy] == 1) {
                            break second;
                        }
                        jcopy--;
                    }
                    jcopy = j+1;
                    while(jcopy < mat[i].length ) {
                        if(mat[i][jcopy] == 1) {
                            break second;
                        }
                        jcopy++;
                    }
                    count++;
                }
            
            } 
        }

        return count;
    }

}
