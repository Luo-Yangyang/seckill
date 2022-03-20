package com.nowcoder.seckill.dao;

import com.nowcoder.seckill.entity.ItemStock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemStockMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ItemStock record);

    ItemStock selectByPrimaryKey(Integer id);

    List<ItemStock> selectAll();

    int updateByPrimaryKey(ItemStock record);

    /**
     * 根据商品ID查询库存信息
     *
     * @param itemId
     * @return
     */
    ItemStock selectByItemId(Integer itemId);

    /**
     * 扣减库存
     *
     * @param itemId
     * @param amount
     * @return
     */
    int decreaseStock(Integer itemId, Integer amount);
}