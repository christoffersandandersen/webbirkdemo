package com.christoffer.webbirkdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class ViewController {

    @Autowired
    OrdersRepository ordersRepository;

    @RequestMapping("/base")
    public String baseView(){
        return "base";
    }


    @RequestMapping("")
    public String indexView(Model model){
        model.addAttribute("orders", ordersRepository.findAll());
        return "index";
    }


}
