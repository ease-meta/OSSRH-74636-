/*
 * Copyright (c) 2011-2021, baomidou (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.boot.generator.mybatis;

import com.boot.generator.mybatis.config.po.TableInfo;

import javax.annotation.Nonnull;
import java.util.Map;

/**
 * @author nieqiurong 2020/11/9.
 * @since 3.5.0
 */
public interface ITemplate {

    @Nonnull
    Map<String, Object> renderData(@Nonnull TableInfo tableInfo);

}
