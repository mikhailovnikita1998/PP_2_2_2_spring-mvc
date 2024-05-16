package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import web.model.Car;
import service.CarService;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl() {
        // Создаем список машин и добавляем в него несколько элементов
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "123456"));
        cars.add(new Car("Ford", "789012"));
        cars.add(new Car("Honda", "345678"));
        // Добавьте еще машин, если необходимо
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            // Если запрошено больше или равно 5 машин, возвращаем весь список
            return cars;
        } else if (count <= 0) {
            // Если count меньше или равно 0, возвращаем пустой список
            return new ArrayList<>();
        } else {
            // Иначе возвращаем список с указанным количеством машин
            return cars.subList(0, Math.min(count, cars.size()));
        }
    }
}
