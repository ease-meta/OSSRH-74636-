package com.open.cloud.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.open.cloud.system.model.Authorities;

import java.util.List;

public interface AuthoritiesService extends IService<Authorities> {

    List<String> listByUserId(Integer userId);

    List<String> listByRoleId(List<Integer> roleId);

    List<String> listByRoleId(Integer roleId);


}
