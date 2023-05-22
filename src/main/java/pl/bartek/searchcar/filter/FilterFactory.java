package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.filter.CarFilter;

public class FilterFactory {
    public CarFilter createModelFilter (String model){
        return new ModelFilter(model);
    }

    public CarFilter createCategoryFilter (String category){
        return new CategoryFilter(category);
    }

    public CarFilter createFromYearFilter (Integer fromYear){
        return new FromYearFilter(fromYear);
    }

    public CarFilter createToYearFilter (Integer toYear){
        return new ToYearFilter(toYear);
    }
}

