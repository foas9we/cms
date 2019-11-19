package com.briup.apps.dao.extend;

import com.briup.apps.bean.extend.BaseUserExtend;

public interface IBaseUserExtendMapper {
    /**
     * 查找用户的角色，通过用户id
     * @param id
     * @return
     */
    BaseUserExtend selcetById(long id);
}
