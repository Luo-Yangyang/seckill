package com.nowcoder.seckill.dao;

import com.nowcoder.seckill.entity.Promotion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PromotionMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Promotion record);

    Promotion selectByPrimaryKey(Integer id);

    List<Promotion> selectAll();

    int updateByPrimaryKey(Promotion record);

    Promotion selectByItemId(Integer itemId);
}