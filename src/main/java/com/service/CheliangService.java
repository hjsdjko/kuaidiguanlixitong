package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangEntity;
import java.util.Map;

/**
 * 车辆 服务类
 * @author 
 * @since 2021-04-16
 */
public interface CheliangService extends IService<CheliangEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}