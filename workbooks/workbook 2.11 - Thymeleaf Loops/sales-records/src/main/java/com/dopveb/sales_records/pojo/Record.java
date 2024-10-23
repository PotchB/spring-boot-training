package com.dopveb.sales_records.pojo;

import java.math.BigDecimal;
import java.util.Objects;

public class Record {
    private String item;
    private BigDecimal revenue;
    private BigDecimal cost;
    /* 
     * double is not suitable for storing currency because it has a certain precision. 
     * BigDecimal is an exact way of representing numbers.
     */

    public Record() {
    }

    public Record(String item, BigDecimal revenue, BigDecimal cost) {
        this.item = item;
        this.revenue = revenue;
        this.cost = cost;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public BigDecimal getRevenue() {
        return this.revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, revenue, cost);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Record record))
            return false;
        // Record other = (Record) obj;
        return Objects.equals(item, record.item) && Objects.equals(revenue, record.revenue)
                && Objects.equals(cost, record.cost);
    }

    
}
