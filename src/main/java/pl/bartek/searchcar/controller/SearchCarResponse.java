package pl.bartek.searchcar.controller;

import pl.bartek.searchcar.Car;

import java.util.List;

class SearchCarResponse {
    private final List<Car> queryCars;


    public SearchCarResponse(List<Car> queryCars) {
        this.queryCars = queryCars;
    }
    public List<Car> getQueryCars() {
        return queryCars;
    }
}

