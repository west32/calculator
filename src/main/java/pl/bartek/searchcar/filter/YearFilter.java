package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.Car;

public class YearFilter implements CarFilter{
    Integer fromYear;
    Integer toYear;

    public YearFilter(Integer fromYear, Integer toYear) {
        this.fromYear = fromYear;
        this.toYear = toYear;
    }

    @Override
    public boolean match(Car car){
        int carYear = car.getYear();
        if (fromYear != null && toYear != null){
            return carYear >= fromYear && carYear <= toYear;
        } else if (fromYear != null){
            return carYear >= fromYear;
        }else if (toYear != null){
            return carYear <= toYear;
        }else return true;
    }
}
