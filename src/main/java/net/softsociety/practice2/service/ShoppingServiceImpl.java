package net.softsociety.practice2.service;

import net.softsociety.practice2.dao.ShoppingDAO;
import net.softsociety.practice2.vo.ItemList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    private ShoppingDAO dao;

    @Override
    public ItemList selectItem(String pnum) {
        return dao.selectItem(pnum);
    }

    @Override
    public List<ItemList> selectItems() {
        return dao.selectItems();
    }
}
