package com.imooc.ad.dao;


import com.imooc.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdUserRepository extends JpaRepository<AdUser, Long> {
    /*自己定义方法*/
    AdUser findByUsername(String username);//根据对象名查询，有就返回
}
