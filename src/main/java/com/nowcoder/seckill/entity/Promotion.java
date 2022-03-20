package com.nowcoder.seckill.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Promotion {

    private Integer id;

    private String name;

    private Timestamp startTime;

    private Timestamp endTime;

    private Integer itemId;

    private BigDecimal promotionPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    /**
     * 获取活动状态
     *
     * @return -1: 活动未开始, 0: 活动进行中, 1: 活动已结束.
     */
    public int getStatus() {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        if (now.before(startTime)) {
            return -1;
        } else if (now.after(endTime)) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", itemId=" + itemId +
                ", promotionPrice=" + promotionPrice +
                '}';
    }
}