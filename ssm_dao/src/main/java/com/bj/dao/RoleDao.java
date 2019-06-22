package com.bj.dao;

import com.bj.entity.Role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleDao {
    //根据用户id值来查询用户对应的所有的角色信息（因为是多对多的关系，所以得要根据用户id值查找到第三张表，代表用户的外键，在通过用户的外键再查找到角色的外键，从而查找到用户所对应的所有的角色）
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "roleName" ,column = "roleName"),
            @Result(property = "roleDesc" ,column = "roleDesc"),
            @Result(property = "permissions" ,column = "id",javaType = java.util.List.class,many = @Many(select = "com.bj.dao.PermissionDao.findPermissionByRoleId",fetchType = FetchType.LAZY))
    })
    public List<Role> findRoleByUserId(String userId);

    //查询所有的角色信息
    @Select("select * from role")
    List<Role> findAll();

    //添加角色
    @Insert("insert into role(roleName,roleDesc) values(#{roleName},#{roleDesc})")
    void save(Role role);
}
