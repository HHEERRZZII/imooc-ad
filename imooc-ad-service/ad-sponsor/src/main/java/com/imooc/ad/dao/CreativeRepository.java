package com.imooc.ad.dao;

import com.imooc.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreativeRepository extends JpaRepository<Creative, Long> {
    //效率比Mybatis低一点。嫌慢就自己手写sql......或自己定义mybatis(针对大项目)
}
