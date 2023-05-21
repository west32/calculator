package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.Car;

public class FromYearFilter implements CarFilter{

    Integer fromYear;

    public FromYearFilter(Integer fromYear) {
        this.fromYear = fromYear;
    }

    @Override
    public boolean match(Car car){
        int carYear = car.getYear();
        return fromYear != null && carYear >= fromYear;
    }
}
