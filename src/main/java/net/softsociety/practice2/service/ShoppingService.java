package net.softsociety.practice2.service;

import net.softsociety.practice2.vo.ItemList;

import java.util.List;

public interface ShoppingService {
    // select one
    ItemList selectItem(String pnum);

    // select all
    List<ItemList> selectItems();
}
