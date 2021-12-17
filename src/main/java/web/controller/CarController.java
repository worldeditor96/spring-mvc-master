package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.models.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String carView(@RequestParam(value = "count", required = false) String count, Model model) {
        Car car1 = new Car("tractor", "dirty", 5);
        Car car2 = new Car("Lada", "red", 110);
        Car car3 = new Car("Ford", "black", 150);
        Car car4 = new Car("VW", "broun", 180);
        Car car5 = new Car("Audi", "black", 250);
        List<Car> list = new ArrayList<Car>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        model.addAttribute("cars", list);

        CarServiceImpl carService=new CarServiceImpl();

        carService.getTable(list, count);

        return "cars";
    }

        /*
    //Способо №2 через HttpServletRequest request
    @GetMapping("/cars")
    public String carView(Model model, HttpServletRequest request) {
        Car car1 = new Car("tractor", "dirty", 5);
        Car car2 = new Car("Lada", "red", 110);
        Car car3 = new Car("Ford", "black", 150);
        Car car4 = new Car("VW", "broun", 180);
        Car car5 = new Car("Audi", "black", 250);
        List<Car> list = new ArrayList<Car>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        model.addAttribute("cars", list);

        String count = request.getParameter("count");

        CarServiceImpl carService=new CarServiceImpl();

        carService.getTable(list, count);

        return "cars";
    }
     */

}


