package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model, @RequestParam(name = "count", required = false, defaultValue = "5") Integer count) {
        model.addAttribute("cars", count >= 5 ? carService.getAllCars() : carService.getCars(count));
        return "cars";
    }

}
