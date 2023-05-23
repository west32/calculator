package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.Car;

public class CategoryFilter implements CarFilter {
    String category;

    public CategoryFilter(String category) {
        this.category = category;
    }

    @Override
    public boolean match (Car car){
        String carCategory = car.getCategory();
        return category != null && carCategory.toLowerCase().contains(category);
    }

}
