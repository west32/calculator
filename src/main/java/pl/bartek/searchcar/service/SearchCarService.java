package pl.bartek.searchcar.service;
import pl.bartek.searchcar.Car;
import pl.bartek.searchcar.filter.CarFilter;
import pl.bartek.searchcar.filter.FilterFactory;
import pl.bartek.searchcar.filter.ModelFilter;

import java.util.*;
import java.util.logging.Filter;

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
//        Set<String> usedParams = new HashSet<>();
        Set<CarFilter> queryFilters = new HashSet<>();
        if(findCarCommand.getModel() != null){
//            usedParams.add("model");
            queryFilters.add(filterFactory.createModelFilter(findCarCommand.getModel()));
        }
        if(findCarCommand.getCategory() != null){
//            usedParams.add("category");
            queryFilters.add(filterFactory.createCategoryFilter(findCarCommand.getCategory()));
        }
        if(findCarCommand.getFromYear() != null || findCarCommand.getToYear() != null){
//            usedParams.add("year");
            queryFilters.add(filterFactory.createYearFilter(findCarCommand.getFromYear(), findCarCommand.getToYear()));
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

