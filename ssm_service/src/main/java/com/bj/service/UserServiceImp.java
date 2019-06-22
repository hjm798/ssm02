package com.bj.service;

import com.bj.dao.UserDao;
import com.bj.entity.Role;
import com.bj.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImp implements UserService {

    //注入dao层对象属性
    @Autowired
    private UserDao userDao;

    //注入加密类
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = userDao.findByUsername(username);
        //将得到的UserInfo对象怎样和UserDetails产生关联。
            //这里用到了spring security中的一个接口(UserDetails)的实现类User,这个类封装了用户名和密码
        User user=new User(userInfo.getUsername(),userInfo.getPassword(),getAuthority(userInfo.getRoles()));

        return user;
    }


    //作用就是返回一个list集合，list集合里面装的是角色的集合
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles){
        List<SimpleGrantedAuthority> list=new ArrayList<>();
        for(Role role:roles){
            list.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
        }
        return list;
    }

    //查找所有用户信息
    @Override
    public List<UserInfo> findAll() {
        //调用service层的方法
        List<UserInfo> list=userDao.findAll();
        return list;
    }

    //添加用户
    @Override
    public void save(UserInfo userInfo) {

        //对密码进行加密,并且将加密后的密码在设置到用户信息里面
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        //调用dao层
        userDao.save(userInfo);
    }

    @Override
    public UserInfo findUserById(String id) {
        return userDao.findUserById(id);
    }

    //查询用户详情信息




}
