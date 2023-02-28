package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private Environment enviroment;

    @GetMapping("namecode")
    public String getProperty(){

        return "Il nome = "+ enviroment.getProperty("myCustomProps.devName")+ " il suo codice  = " + enviroment.getProperty("myCustomProps.authCode");
    }

}