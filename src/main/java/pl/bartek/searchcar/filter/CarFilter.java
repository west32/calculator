package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.Car;

public interface CarFilter {

    public boolean match (Car car);
}
