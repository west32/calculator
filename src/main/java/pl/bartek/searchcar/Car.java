package pl.bartek.searchcar;

public class Car {

    private String model;
    private String category;
    private String year;

    public Car(String model, String category, String year) {
        this.model = model;
        this.category = category;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
