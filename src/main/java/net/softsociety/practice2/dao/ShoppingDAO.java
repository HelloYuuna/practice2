package net.softsociety.practice2.dao;

import net.softsociety.practice2.vo.ItemList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingDAO {

    // selectOne
    ItemList selectItem(String pnum);

    // selectAll
    List<ItemList> selectItems();
}
