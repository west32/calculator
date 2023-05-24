package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.CarCategory;
import pl.bartek.searchcar.CarModel;

public class FilterFactory {

    public CarFilter create(CarModel model){
        return new ModelFilter(model);
    }

    public CarFilter create(CarCategory category){
        return new CategoryFilter(category);
    }

    public CarFilter create(Integer fromYear, Integer toYear){
        return new YearFilter(fromYear, toYear);
    }
}

