package pl.bartek.searchcar.filter;

public class FilterFactory {

    public CarFilter createModelFilter (String model){
        return new ModelFilter(model);
    }

    public CarFilter createCategoryFilter (String category){
        return new CategoryFilter(category);
    }

    public CarFilter createYearFilter (Integer fromYear, Integer toYear){
        return new YearFilter(fromYear, toYear);
    }
}

