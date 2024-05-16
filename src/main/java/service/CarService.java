package service;

import java.util.List;

import org.springframework.stereotype.Service;
import web.model.Car;

@Service
public interface CarService {
    List<Car> getCars(int count);
    List<Car> getAllCars();
}
