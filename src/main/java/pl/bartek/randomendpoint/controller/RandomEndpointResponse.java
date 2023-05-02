package pl.bartek.randomendpoint.controller;

public class RandomEndpointResponse {
    private final Sex sex;
    public RandomEndpointResponse(Sex sex) {
        this.sex = sex;
    }
    public Sex getSex() {
        return sex;
    }
}


