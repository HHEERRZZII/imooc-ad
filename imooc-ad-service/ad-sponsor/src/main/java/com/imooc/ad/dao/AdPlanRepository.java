package com.imooc.ad.dao;

import com.imooc.ad.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {
    AdPlan findByIdAndUserId(Long id, Long userId);
    //这个方法的意思是查询某个用户一共定了多少种广告,入参是广告的序号！！！！即通过确认序号和userId，返回具体的广告内容
    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);
    //查询广告
    AdPlan findByUserIdAndPlanName(Long userId, String planName);
    //通过状态查询目前该状态下的广告具体信息
    List<AdPlan> findAllByPlanStatus(Integer status);

}
