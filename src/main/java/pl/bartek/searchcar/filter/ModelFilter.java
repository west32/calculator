package pl.bartek.searchcar.filter;

import pl.bartek.searchcar.Car;
import pl.bartek.searchcar.CarModel;

public class ModelFilter implements CarFilter{
    CarModel model;

    public ModelFilter(CarModel model) {
        this.model = model;
    }

    @Override
    public boolean match(Car car) {
        String carModel = car.getModel();
        return model != null && carModel.toLowerCase().contains(model.get());
    }
}
