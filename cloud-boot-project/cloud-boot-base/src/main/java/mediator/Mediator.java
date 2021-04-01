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
package mediator;

/**
 * @author shadow
 * @Date 2016年8月8日下午7:10:09
 * @Fun 中介、调节实际上需要交互的两个元素，让其松耦合
 **/
public class Mediator implements IMediator {

    private XmlCode xmlCode;
    private XmlPreview xmlPreview;

    @Override
    public void creareMediator() {
        // TODO Auto-generated method stub
        this.xmlCode = new XmlCode();
        this.xmlPreview = new XmlPreview();
    }

    @Override
    public void work() {
        // TODO Auto-generated method stub
        this.xmlCode.work();
        this.xmlPreview.work();
    }

}
