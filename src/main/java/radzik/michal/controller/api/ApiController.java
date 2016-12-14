package radzik.michal.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import radzik.michal.domain.MessageDto;

import java.util.Date;

/**
 * Created by Michal on 2016-12-13.
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/text")
    @ResponseBody
    String getText() {
        return "Hello World!";
    }

    @RequestMapping("/message")
    @ResponseBody
    MessageDto getMessage() {

        MessageDto messageDto = new MessageDto("Moja wiadomosc", new Date());

        return messageDto;
    }
}
