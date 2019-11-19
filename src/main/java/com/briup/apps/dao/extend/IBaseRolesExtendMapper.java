package com.briup.apps.dao.extend;

import com.briup.apps.bean.BaseRole;

import java.util.List;

public interface IBaseRolesExtendMapper {
    List<BaseRole> selectByUserId(long id);
}
