package com.christoffer.webbirkdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrdersRepository ordersRepository;

    @PostMapping("/add")
    @ResponseBody
    String addNewOrder(@RequestParam Boolean completed, @RequestParam String name){
        Orders orders = new Orders();
        orders.setCompleted(completed);
        orders.setName(name);

        ordersRepository.save(orders);
        return "Order saved";
    }



}
