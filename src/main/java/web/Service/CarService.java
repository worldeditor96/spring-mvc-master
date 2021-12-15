package web.Service;

import web.models.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CarService {
    public void getTable(List<Car> cars, String count);

}
