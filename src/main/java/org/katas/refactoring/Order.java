package org.katas.refactoring;

import java.util.List;

public class Order {
    private String nm;
    private String addr;
    private List<LineItem> li;

    public Order(String nm, String addr, List<LineItem> li) {
        this.nm = nm;
        this.addr = addr;
        this.li = li;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setLi(List<LineItem> li) {
        this.li = li;
    }

    public String getCustomerName() {
        return nm;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public List<LineItem> getLineItems() {
        return li;
    }
}
