package com.christoffer.webbirkdemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {

    //List<Orders> getAllBySorOrderBy

}
