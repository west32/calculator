package pl.bartek.searchcar.service;
import pl.bartek.searchcar.Car;

import java.util.*;

public class SearchCarService {
    private final List<Car> carsRepository = new ArrayList<>();



    public SearchCarService() {
        carsRepository.add(new Car("100","Wagon, Sedan", 1994));
        carsRepository.add(new Car("100","Wagon, Sedan", 1993));
        carsRepository.add(new Car("100","Wagon, Sedan", 1992));
        carsRepository.add(new Car("80","Sedan", 1992));
        carsRepository.add(new Car("90","Sedan", 1994));
        carsRepository.add(new Car("90","Sedan", 1995));
        carsRepository.add(new Car("90","Sedan", 1993));
        carsRepository.add(new Car("A3","Convertible, Sedan", 2019));
        carsRepository.add(new Car("A3","Sedan, Convertible", 2018));
        carsRepository.add(new Car("A3","Sedan, Convertible", 2017));
    }

    public List<Car> findCar(String model, String category, int fromYear, Integer toYear){
        List<Car> queryCars = new ArrayList<>();
        Set<String> usedParams = new HashSet<>();
        if(!Objects.equals(model,"")){
            usedParams.add("model");
        }
        if(!Objects.equals(category,"")){
            usedParams.add("category");
        }
        if(fromYear != 0){
            usedParams.add("fromYear");
        }
        if(toYear != null){
            usedParams.add("toYear");
        }
        if(usedParams.isEmpty()){
            return queryCars;
        }
        for (Car car: carsRepository) {
            if ( (!usedParams.contains("model")|| car.getModel().toLowerCase().contains(model))
            &(!usedParams.contains("category")|| car.getCategory().toLowerCase().contains(category))
            &(!usedParams.contains("fromYear")|| car.getYear() >= fromYear)
            &(!usedParams.contains("toYear"))){
                queryCars.add(car);
            }
        }
        return queryCars;
    }
}
