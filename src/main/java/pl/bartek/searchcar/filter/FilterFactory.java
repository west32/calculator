package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.filter.CarFilter;

public class FilterFactory {

    public CarFilter createFilter(String parameter){
        return switch (parameter) {
            case "model" -> new ModelFilter(parameter);
            case "category" -> new CategoryFilter(parameter);
            case "fromYear" -> new FromYearFilter(parameter);
            case "toYear" -> new ToYearFilter(parameter);
            default -> null;
        };

    }
}
