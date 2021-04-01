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
package com.open.cloud.boot.autoconfigure.oss.sftp;

import java.io.Serializable;
import java.nio.charset.Charset;

/**
 * FTP配置项，提供FTP各种参数信息
 *
 * @author looly
 */
public class FtpConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主机
     */
    private String host;
    /**
     * 端口
     */
    private int port;
    /**
     * 用户名
     */
    private String user;
    /**
     * 密码
     */
    private String password;
    /**
     * 编码
     */
    private Charset charset;
    /**
     * 连接超时时长，单位毫秒
     */
    private long connectionTimeout;
    /**
     * Socket连接超时时长，单位毫秒
     */
    private long soTimeout;
    /**
     * 设置服务器语言
     */
    private String serverLanguageCode;
    /**
     * 设置服务器系统关键词
     */
    private String systemKey;

    /**
     * 构造
     */
    public FtpConfig() {
    }

    /**
     * 构造
     *
     * @param host     主机
     * @param port     端口
     * @param user     用户名
     * @param password 密码
     * @param charset  编码
     */
    public FtpConfig(String host, int port, String user, String password, Charset charset) {
        this(host, port, user, password, charset, null, null);
    }

    /**
     * 构造
     *
     * @param host               主机
     * @param port               端口
     * @param user               用户名
     * @param password           密码
     * @param charset            编码
     * @param serverLanguageCode 服务器语言
     * @param systemKey          系统关键字
     * @since 5.5.7
     */
    public FtpConfig(String host, int port, String user, String password, Charset charset,
                     String serverLanguageCode, String systemKey) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
        this.charset = charset;
        this.serverLanguageCode = serverLanguageCode;
        this.systemKey = systemKey;
    }

    public static FtpConfig create() {
        return new FtpConfig();
    }

    public String getHost() {
        return host;
    }

    public FtpConfig setHost(String host) {
        this.host = host;
        return this;
    }

    public int getPort() {
        return port;
    }

    public FtpConfig setPort(int port) {
        this.port = port;
        return this;
    }

    public String getUser() {
        return user;
    }

    public FtpConfig setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public FtpConfig setPassword(String password) {
        this.password = password;
        return this;
    }

    public Charset getCharset() {
        return charset;
    }

    public FtpConfig setCharset(Charset charset) {
        this.charset = charset;
        return this;
    }

    public long getConnectionTimeout() {
        return connectionTimeout;
    }

    public FtpConfig setConnectionTimeout(long connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    public long getSoTimeout() {
        return soTimeout;
    }

    public FtpConfig setSoTimeout(long soTimeout) {
        this.soTimeout = soTimeout;
        return this;
    }

    public String getServerLanguageCode() {
        return serverLanguageCode;
    }

    public FtpConfig setServerLanguageCode(String serverLanguageCode) {
        this.serverLanguageCode = serverLanguageCode;
        return this;
    }

    public String getSystemKey() {
        return systemKey;
    }

    public FtpConfig setSystemKey(String systemKey) {
        this.systemKey = systemKey;
        return this;
    }
}
