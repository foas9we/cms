package com.briup.apps.service;

import com.briup.apps.bean.extend.BaseUserExtend;

public interface IBaseUserService {
    BaseUserExtend findById(long id);
}
