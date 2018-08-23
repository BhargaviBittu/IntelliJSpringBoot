package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestControllerApplication {

    @RequestMapping("/")
    public String Hello(){
        System.out.println("i am here");
        return "Hello World";
    }

    @RequestMapping("/notprotected")
    public String HelloAgain(){
        return "Hello from not protected user";
    }

    @RequestMapping("/protectedByUserRole")
    public String HelloUser(){
        return "Hello from protected user";
    }

    @RequestMapping("/protectedByAdminRole")
    public String HelloAdmin(){
        return "Hello from protected admin";
    }

}
