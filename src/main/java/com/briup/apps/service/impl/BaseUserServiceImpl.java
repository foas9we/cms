package com.briup.apps.service.impl;

import com.briup.apps.bean.extend.BaseUserExtend;
import com.briup.apps.dao.extend.IBaseUserExtendMapper;
import com.briup.apps.service.IBaseUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BaseUserServiceImpl implements IBaseUserService {
    @Resource
    IBaseUserExtendMapper baseUserExtendMapper;

    @Override
    public BaseUserExtend findById(long id) {
        BaseUserExtend baseUserExtend = baseUserExtendMapper.selcetById(id);
        return baseUserExtend;
    }
}
