package pl.bartek.searchcar.service;
import pl.bartek.searchcar.Car;

import java.util.*;

public class SearchCarService {
    private final List<Car> carsRepository = new ArrayList<>();
    private FindCarCommand findCarCommand;

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

    public List<Car> findCar(FindCarCommand findCarCommand){
        List<Car> queryCars = new ArrayList<>();
        Set<String> usedParams = new HashSet<>();
        if(findCarCommand.getModel() != null){
            usedParams.add("model");
        }
        if(findCarCommand.getCategory() != null){
            usedParams.add("category");
        }
        if(findCarCommand.getFromYear() != null){
            usedParams.add("fromYear");
        }
        if(findCarCommand.getToYear() != null){
            usedParams.add("toYear");
        }
        if(usedParams.isEmpty()){
            return queryCars;
        }
        for (Car car: carsRepository) {
            if ( (!usedParams.contains("model")|| car.getModel().toLowerCase().contains(findCarCommand.getModel()))
            &(!usedParams.contains("category")|| car.getCategory().toLowerCase().contains(findCarCommand.getCategory()))
            &(!usedParams.contains("fromYear")|| car.getYear() >= findCarCommand.getFromYear())
            &(!usedParams.contains("toYear")|| car.getYear() <= findCarCommand.getToYear())){
                queryCars.add(car);
            }
        }
        return queryCars;
    }
}
