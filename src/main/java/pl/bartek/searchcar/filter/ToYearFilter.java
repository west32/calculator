package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.Car;

public class ToYearFilter implements CarFilter{

    Integer toYear;

    public ToYearFilter(Integer toYear) {
        this.toYear = toYear;
    }

    @Override
    public boolean match (Car car){
        int carYear =  car.getYear();
        return toYear != null && carYear <= toYear;
    }
}
