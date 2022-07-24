package net.softsociety.practice2.vo;

import lombok.Data;

@Data
public class OrderList {
    private String orderNum;
    private String usrId;
    private String usrName;
    private String usrAddress;
    private String pNum;                       //otemlist reference
    private String pName;
    private int pAmount;
    private int pPrice;
}
