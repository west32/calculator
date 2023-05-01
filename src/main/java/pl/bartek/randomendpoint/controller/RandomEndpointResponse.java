package pl.bartek.randomendpoint.controller;

import pl.bartek.randomendpoint.service.RandomEndpointService;

public class RandomEndpointResponse {
    Sex sex;

    public RandomEndpointResponse(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }
}


