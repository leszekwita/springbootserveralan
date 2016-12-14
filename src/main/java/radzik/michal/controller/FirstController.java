package radzik.michal.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Michal on 2016-12-13.
 */
@Controller
@EnableAutoConfiguration
public class FirstController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World";
    }

    @RequestMapping("/FirstController")
    @ResponseBody
    String first() {
        return "FirstController.home";
    }
}