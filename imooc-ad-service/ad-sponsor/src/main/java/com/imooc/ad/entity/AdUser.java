package com.imooc.ad.entity;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.imooc.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "ad_user")
public class AdUser {
    //entity就是代表实体类！无论是工作还是自己的项目
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id", nullable = false)
    private Long id;

    @Basic
    //@Column(name = "username", nullable = false)
    private String username;

    @Basic
    //@Column(name = "token", nullable = false)
    private String token;

    @Basic
    //@Column(name = "user_status", nullable = false)
    //默认用户创建时就是有效状态，所以不需要指定
    private Integer userStatus;

    @Basic
   // @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Basic
    //@Column(name = "update_time", nullable = false)
    private Date updateTime;

    public AdUser (String username, String token) {
        this.username = username;
        this.token = token;
        this.userStatus = CommonStatus.VALID.getStatus();//get取出来的是value，不要混了！
        this.createTime = new Date();
        this.updateTime = createTime;
    }
}
