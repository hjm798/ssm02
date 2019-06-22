package com.bj.dao;

import com.bj.entity.UserInfo;
import net.sf.jsqlparser.statement.insert.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    @Select("select * from users where username=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "roles", column = "id", javaType = java.util.List.class, many = @Many(select = "com.bj.dao.RoleDao.findRoleByUserId", fetchType = FetchType.LAZY)),

    })
    public UserInfo findByUsername(String username);

    //查找所有的用户信息
    @Select("select * from users ")
    List<UserInfo> findAll();

    //添加用户
    @org.apache.ibatis.annotations.Insert("insert into users(email,username,password,phoneNum) values(#{email},#{username},#{password},#{phoneNum})")
    void save(UserInfo userInfo);

    //查询用户详情信息
    @Select("select * from users where id=#{id}")


    @Results({
        @Result(id = true, property = "id", column = "id"),
        @Result(property = "username", column = "username"),
        @Result(property = "email", column = "email"),
        @Result(property = "password", column = "password"),
        @Result(property = "phoneNum", column = "phoneNum"),
        @Result(property = "roles", column = "id", javaType = java.util.List.class, many = @Many(select = "com.bj.dao.RoleDao.findRoleByUserId", fetchType = FetchType.LAZY)),
    })
    UserInfo findUserById(String id);
}
