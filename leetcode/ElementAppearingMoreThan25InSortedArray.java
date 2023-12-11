class ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        int max = 0;
        int count = 1;
        int num = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                count++;
            } else {
                if(count > max) {
                    num = arr[i-1];
                    max = count;
                }
                count = 1;
            }
        }

        return (count > max) ? arr[arr.length - 1] : num;
    }
}
