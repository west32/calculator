package pl.bartek.searchcar;

import java.util.Objects;

public class CarModel  {

    private final String carModel;

    public CarModel(String carModel) {
        this.carModel = carModel;
    }

    public String get() {
        return carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel1 = (CarModel) o;
        return carModel.equals(carModel1.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel);
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "carModel='" + carModel + '\'' +
                '}';
    }
}
