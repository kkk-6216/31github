import java.util.*;

class FoodRatings {

    private HashMap<String, TreeSet<Food>> cuisine;
    private HashMap<String, HashMap<String, Integer>> foods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        cuisine = new HashMap<>();
        this.foods = new HashMap<>();
        for(int i = 0; i < foods.length; i++) {
            if(cuisine.containsKey(cuisines[i])) {
                Food food = new Food(foods[i], ratings[i]);
                this.foods.get(cuisines[i]).put(foods[i], ratings[i]);
                cuisine.get(cuisines[i]).add(food);
            } else {
                TreeSet<Food> food = new TreeSet<>();
                Food f = new Food(foods[i], ratings[i]);
                food.add(f);
                HashMap<String, Integer> map = new HashMap<>();
                map.put(foods[i], ratings[i]);
                this.foods.put(cuisines[i], map);
                cuisine.put(cuisines[i], food);
            }
        }
    }

    public void changeRating(String food, int newRating) {
        for(Map.Entry<String, HashMap<String, Integer>> item : foods.entrySet()) {
            if(item.getValue().containsKey(food)) {
                Integer num = item.getValue().get(food);
                Food f = new Food(food, num);
                cuisine.get(item.getKey()).remove(f);
                f.setRating(newRating);
                cuisine.get(item.getKey()).add(f);
                item.getValue().put(food, newRating);
            }
        }
    }

    public String highestRated(String cuisine) {
        return this.cuisine.get(cuisine).first().getName();
    }

    private class Food implements Comparable<Food> {

        private String name;
        private int rating;

        public Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }

        public String getName() { return name; }

        public int getRating() { return rating; }

        public void setRating(int rating) { this.rating = rating; }

        @Override
        public int compareTo(Food food) {
            if(rating == food.getRating()) {
                return name.compareTo(food.getName());
            }else{
                return food.rating - rating;
            }
        }
    }
}
