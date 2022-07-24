package net.softsociety.practice2.service;

import net.softsociety.practice2.vo.OrderList;

import java.util.List;

public interface CartService {

    int insertCart(OrderList orderList);

    List<OrderList> selectAll();

    int deleteCart(String pNum);
}
