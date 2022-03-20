package com.nowcoder.seckill.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ItemStock {

    private Integer id;

    private Integer itemId;

    @Min(value = 0, message = "库存数量不能小于0")
    private Integer stock;

    public ItemStock() {
        super();
    }

    public ItemStock(Integer stock) {
        super();
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ItemStock{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", stock=" + stock +
                '}';
    }
}