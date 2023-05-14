package pl.bartek.searchcar.service;
import pl.bartek.searchcar.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

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

    public List<Car> findCar(String model, String category, int fromYear, int toYear){
        List<Car> queryCars = new ArrayList<>();
        for (Car car: carsRepository) {
            if (!Objects.equals(model, "") && car.getModel().toLowerCase().contains(model)){
                queryCars.add(car);
            }else if (!Objects.equals(category, "") && car.getCategory().toLowerCase().contains(category)) {
                queryCars.add(car);
            }else if (car.getYear()>= fromYear && car.getYear() <= toYear){
                queryCars.add(car);
            }
        }
        return queryCars;
    }
}
