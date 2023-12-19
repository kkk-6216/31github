class ImageSmoother {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];

        for(int i = 0; i < img.length; i++) {
            for(int j = 0; j < img[i].length; j++) {
                int sum = 0;
                int count = 0;

                for(int x = i-1; x <= i+1; x++) {
                    for(int y = j-1; y <= j+1; y++) {
                        if(x >= 0 && x < img.length && y >= 0 && y < img[i].length) {
                            sum += img[x][y];
                            count++;
                        }
                    }
                }

                sum = sum / count;
                result[i][j] = sum;
            }
        }

        return result;
    }
}
