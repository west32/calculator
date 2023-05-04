package pl.bartek.searchcar.service;

import pl.bartek.searchcar.Car;

import java.util.ArrayList;
import java.util.List;

public class SearchCarService {
    private final List<Car> carsRepository = new ArrayList<>();
    private final List<Car> queryCars = new ArrayList<>();
    public SearchCarService() {

        carsRepository.add(new Car("100","Wagon, Sedan", "1994"));
        carsRepository.add(new Car("100","Wagon, Sedan", "1993"));
        carsRepository.add(new Car("100","Wagon, Sedan", "1992"));
        carsRepository.add(new Car("80","Sedan", "1992"));
        carsRepository.add(new Car("90","Sedan", "1994"));
        carsRepository.add(new Car("90","Sedan", "1995"));
        carsRepository.add(new Car("90","Sedan", "1993"));
        carsRepository.add(new Car("A3","Convertible, Sedan", "2019"));
        carsRepository.add(new Car("A3","Sedan, Convertible", "2018"));
        carsRepository.add(new Car("A3","Sedan, Convertible", "2017"));
    }

    public List<Car> findCar(String query){
        for (Car car: carsRepository) {
            if (car.getCategory().contains(query)|| car.getModel().contains(query)|| car.getYear().contains(query)) {
                queryCars.add(car);
            }
        }
        return queryCars;
    }
}
