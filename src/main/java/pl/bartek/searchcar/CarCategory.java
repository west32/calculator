package pl.bartek.searchcar;

import java.util.Objects;

public class CarCategory {
    private final String carCategory;

    public CarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    public String get() {
        return carCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarCategory that = (CarCategory) o;
        return carCategory.equals(that.carCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carCategory);
    }

    @Override
    public String toString() {
        return "CarCategory{" +
                "carCategory='" + carCategory + '\'' +
                '}';
    }
}
