package pl.bartek.randomendpoint.service;

public class RandomEndpointService {
    private final String Hello;
    private final int id;

    public RandomEndpointService(String Hello, int id) {
        this.Hello = Hello;
        this.id = id;
    }
    public String getHello() {
        return Hello;
    }

    public int getId() {
        return id;
    }
}
