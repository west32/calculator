package pl.bartek.searchcar.service;

import pl.bartek.searchcar.Car;
import pl.bartek.searchcar.filter.CarFilter;
import pl.bartek.searchcar.filter.FilterFactory;
import java.util.*;

public class SearchCarService {
    private final List<Car> carsRepository = new ArrayList<>();
    private FindCarCommand findCarCommand;
    private final FilterFactory filterFactory;

    public SearchCarService(FilterFactory filterFactory) {
        this.filterFactory = filterFactory;
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
        Set<CarFilter> queryFilters = new HashSet<>();
        if(findCarCommand.getModel() != null){
            queryFilters.add(filterFactory.create(findCarCommand.getModel()));
        }
        if(findCarCommand.getCategory() != null){
            queryFilters.add(filterFactory.create(findCarCommand.getCategory()));
        }
        if(findCarCommand.getFromYear() != null || findCarCommand.getToYear() != null){
            queryFilters.add(filterFactory.create(findCarCommand.getFromYear(), findCarCommand.getToYear()));
        }
        if(queryFilters.isEmpty()){
            return queryCars;
        }
        for (Car car : carsRepository) {
            boolean allFiltersTrue = true;
            for (CarFilter carFilter : queryFilters){
                if (!carFilter.match(car)){
                    allFiltersTrue = false;
                }
            }
            if (allFiltersTrue){
                queryCars.add(car);
            }
        }
        return queryCars;
    }
}
