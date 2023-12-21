class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] array = new int[points.length];
        for(int i = 0; i < points.length; i++) {
            array[i] = points[i][0];
        }

        Arrays.sort(array);

        int max = 0;
        for(int i = 1; i < array.length; i++) {
            if(array[i] - array[i-1] > max) max = array[i] - array[i-1];
        }

        return max;
    }
}
