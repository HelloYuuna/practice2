package net.softsociety.practice2.dao;

import net.softsociety.practice2.vo.OrderList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartDAO {
    int insertCart(OrderList orderList);    // 카트에 담기

    List<OrderList> selectAll();

    int deleteCart(String pNum);
}
