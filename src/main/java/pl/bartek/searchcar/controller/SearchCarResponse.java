package pl.bartek.searchcar.controller;

import pl.bartek.searchcar.Car;

import java.util.List;

public class SearchCarResponse {
    private final List<Car> quertCars;

    public SearchCarResponse(List<Car> quertCars) {
        this.quertCars = quertCars;
    }

    public List<Car> getQuertCars() {
        return quertCars;
    }
}

