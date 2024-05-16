package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import web.model.Car;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCars(int count) {
        // Создаем список для хранения автомобилей
        List<Car> cars = new ArrayList<>();

        // Добавляем заданное количество автомобилей в список
        for (int i = 0; i < count; i++) {
            // Создаем новый объект Car и добавляем его в список
            cars.add(new Car("Toyota", "123456"));
        }

        return cars;
    }

    @Override
    public List<Car> getAllCars() {
        // Здесь должна быть логика получения всех машин из базы данных или другого источника данных
        return new ArrayList<>();
    }
}
