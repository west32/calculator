package pl.bartek.searchcar;

public class Car {

    private final String model;
    private final String category;
    private final int year;

    public Car(String model, String category, int year) {
        this.model = model;
        this.category = category;
        this.year = year;
    }

    public String getModel() {
        return model;
    }
    public String getCategory() {
        return category;
    }

    public int getYear() {
        return year;
    }
}