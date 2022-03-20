package com.nowcoder.seckill.dao;

import com.nowcoder.seckill.entity.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Item record);

    Item selectByPrimaryKey(Integer id);

    List<Item> selectAll();

    int updateByPrimaryKey(Item record);

    /**
     * 增加销量
     *
     * @param id
     * @param amount
     * @return
     */
    int increaseSales(Integer id, Integer amount);

    /**
     * 查询正在进行秒杀活动的商品
     *
     * @return
     */
    List<Item> selectOnPromotion();
}