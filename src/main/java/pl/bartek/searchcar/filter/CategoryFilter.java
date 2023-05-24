package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.Car;
import pl.bartek.searchcar.CarCategory;

public class CategoryFilter implements CarFilter {
    CarCategory category;

    public CategoryFilter(CarCategory category) {
        this.category = category;
    }

    @Override
    public boolean match (Car car){
        String carCategory = car.getCategory();
        return category != null && carCategory.toLowerCase().contains(category.get());
    }

}
