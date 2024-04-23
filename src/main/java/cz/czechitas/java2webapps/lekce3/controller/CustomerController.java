package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CustomerController {
    @GetMapping("/")
    public ModelAndView showCard() {

        Address address = new Address(
                "Nikoly Tesly 14",
                "Praha 6",
                "160 00"
        );

        Person person = new Person(
                "Eliska",
                "Novakova",
                LocalDate.of(1947, 11, 18),
                "https://thispersondoesnotexist.com/",
                address
        );

        ModelAndView modelAndView = new ModelAndView("card");
        modelAndView.addObject("person", person);
        modelAndView.addObject("address", address);

        return modelAndView;
    }
}
