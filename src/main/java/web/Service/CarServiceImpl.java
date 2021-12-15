package web.Service;

import com.mysql.cj.Query;
import org.springframework.web.bind.annotation.GetMapping;
import web.models.Car;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CarServiceImpl implements CarService {

    @Override
    public void getTable(List<Car> cars, String count) {

        int countNumber = 0;

        if (count != null) {
            countNumber = Integer.parseInt(count.replaceAll("[^0-9]", ""));
        }

        if (countNumber >= 5) {
            countNumber = 5;
        }

        Stream streamCar = cars.stream();

        streamCar.limit(countNumber)
                .forEach(s -> System.out.println(s));
    }
}
