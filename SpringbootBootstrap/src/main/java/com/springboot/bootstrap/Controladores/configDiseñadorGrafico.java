package com.springboot.bootstrap.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class configDiseñadorGrafico {

    @RequestMapping("/configDiseñador")
    public String configDiseñador() {return "/pages/configDiseñadorGrafico";}

}
