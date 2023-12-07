class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        
        if(numRows <= 0) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> ls = null;

        for(int i = 0; i < numRows; i++) {
            List<Integer> l = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    l.add(1);
                } else {
                    l.add(ls.get(j) + ls.get(j-1));
                }
            }
            result.add(l);
            ls = l;
        }

        return result;
    }
}
