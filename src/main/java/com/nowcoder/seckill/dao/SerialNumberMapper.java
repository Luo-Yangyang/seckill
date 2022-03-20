package com.nowcoder.seckill.dao;

import com.nowcoder.seckill.entity.SerialNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SerialNumberMapper {

    int deleteByPrimaryKey(String name);

    int insert(SerialNumber record);

    SerialNumber selectByPrimaryKey(String name);

    List<SerialNumber> selectAll();

    int updateByPrimaryKey(SerialNumber record);
}