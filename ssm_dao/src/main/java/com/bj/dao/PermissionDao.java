package com.bj.dao;

import com.bj.entity.Permission;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionDao {
    //根据id值查询到指定的权限信息

    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id})")
    public Permission findPermissionByRoleId(String id);

    //查询所有的权限信息
    @Select("select * from permission")
    List<Permission> findAll();

    //添加权限的方法
    @Insert("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission);
}
