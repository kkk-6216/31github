class DestinationCity {
    public String destCity(List<List<String>> paths) {
       if(paths.size() == 1) {
           return paths.get(0).get(1);
       }

       Map<String, String> map = new HashMap<>();
       for(List<String> path: paths) {
           map.put(path.get(0), path.get(1));
       }

       String destination = map.get(paths.get(0).get(0));

       while(map.containsKey(destination)) {
           destination = map.get(destination);
       }

       return destination;
    }
}
