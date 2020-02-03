package lab9.prob9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
   
    public static boolean findType(final List<Dish> menu, Type t) {
    	return menu.stream().anyMatch(x->x.type==t);
    }
    
    public static boolean findCalories(final List<Dish> menu, int cal) {
    	return menu.stream().anyMatch(x->x.calories<cal);
    }
    public static boolean findUnhealthy(final List<Dish> menu, int cal) {
    	return menu.stream().anyMatch(x->x.calories>cal);
    }
    public static Optional<Dish> getType(final List<Dish> menu, Type t) {
    	return menu.stream().filter(x->x.type==t).findFirst();
    }
    public static int calculateTotalCalories() {
    	return menu.stream().map(x->x.getCalories()).reduce(Integer::sum).get();
    }
    public static int calculateTotalCaloriesMethod() {
    	return menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
    }
    public static void main(String[] args) {
    	System.out.println("A. Is there any Vegetarian meal available: "+findType(menu, Type.OTHER));
    	System.out.println("B. Is there any healthy menu have calories less than 1000: "+findCalories(menu, 1000));
    	System.out.println("C. Is there any unhealthy menu have calories greater than 1000: "+findUnhealthy(menu, 1000));
    	System.out.println("D. find and return the first item for the type of MEAT: "+getType(menu, Type.MEAT).get());
    	System.out.println("E. Total Calories: "+calculateTotalCalories());
    	System.out.println("F. Total Calories with metod reference: "+calculateTotalCaloriesMethod());
    	
    	
    }
    
    
}