/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.open.cloud.dubbo.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.open.cloud.dubbo.provider.entity.BatchOnlineCheckEntity;

/**
 * 文件登记表(UPRGHT)
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-04-19 20:14:13
 */
public interface BatchOnlineCheckService extends IService<BatchOnlineCheckEntity> {
    BatchOnlineCheckEntity getByJobId(String id);
}
