package net.softsociety.practice2.service;

import net.softsociety.practice2.dao.CartDAO;
import net.softsociety.practice2.vo.OrderList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDAO dao;

    @Override
    public int insertCart(OrderList orderList) {
        return dao.insertCart(orderList);
    }

    @Override
    public List<OrderList> selectAll() {
        return dao.selectAll();
    }

    @Override
    public int deleteCart(String pNum) {
        return dao.deleteCart(pNum);
    }
}
