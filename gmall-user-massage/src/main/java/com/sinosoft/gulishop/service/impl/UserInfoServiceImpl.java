package com.sinosoft.gulishop.service.impl;

import com.sinosoft.gulishop.entity.UserInfo;
import com.sinosoft.gulishop.mapper.UserInfoMapper;
import com.sinosoft.gulishop.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author guli
 * @since 2021-04-16
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
