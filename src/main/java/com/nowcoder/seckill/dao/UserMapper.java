package com.nowcoder.seckill.dao;

import com.nowcoder.seckill.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
    /**
     * 根据手机号查询用户
     *
     * @param phone
     * @return
     */
    User selectByPhone(String phone);
}