package com.springboot.bootstrap.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminControlador {

    @RequestMapping("/configAdmin")
    public String configAdmin(){
        return "/pages/configAdmin";
    }

}
