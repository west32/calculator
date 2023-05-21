package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.Car;

public class ModelFilter implements CarFilter{
    String model;

    public ModelFilter(String model) {
        this.model = model;
    }

    @Override
    public boolean match(Car car) {
        String carModel = car.getModel();
        return model != null && carModel.contains(model);
    }

}
