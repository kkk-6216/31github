class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        if(flowerbed == null) return false;
        if(flowerbed.length == 1) {
            return (flowerbed[0] == 0 && n == 1) ||
                    (flowerbed[0] == 0 && n == 0) ||
                    (flowerbed[0] == 1 && n == 0) ||
                    (flowerbed[0] == 1 && n != 1);
        }

        for(int i = 0; i < flowerbed.length; i++) {
            if(zeroAround(flowerbed, i)) {
                count++;
                i++;
            }
        }

        return count >= n;
    }

    private boolean zeroAround(int[] flowerbed, int i) {

        if(i == 0) {
            return flowerbed[i] == 0 && flowerbed[i+1] == 0;
        }

        if(i == flowerbed.length - 1) {
            return flowerbed[i] == 0 && flowerbed[i-1] == 0;
        }

        if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
            return true;
        }
        else return false;
    }
}
