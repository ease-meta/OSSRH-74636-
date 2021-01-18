package com.open.cloud.boot.autoconfigure.oss.alibaba;

import com.aliyun.oss.ClientBuilderConfiguration;

public class AliOssProperties {

	/**
	 * Authorization Mode, please see <a href=
	 * "https://help.aliyun.com/document_detail/32010.html?spm=a2c4g.11186623.6.659.29f145dc3KOwTh">oss
	 * docs</a>.
	 */
	//@Value("${" + PREFIX + ".authorization-mode:AK_SK}")
	private AliCloudAuthorizationMode authorizationMode;

	/**
	 * Endpoint, please see <a href=
	 * "https://help.aliyun.com/document_detail/32010.html?spm=a2c4g.11186623.6.659.29f145dc3KOwTh">oss
	 * docs</a>.
	 */
	private String endpoint;

	/**
	 * Sts token, please see <a href=
	 * "https://help.aliyun.com/document_detail/32010.html?spm=a2c4g.11186623.6.659.29f145dc3KOwTh">oss
	 * docs</a>.
	 */
	private StsToken sts;

	/**
	 * Client Configuration, please see <a href=
	 * "https://help.aliyun.com/document_detail/32010.html?spm=a2c4g.11186623.6.659.29f145dc3KOwTh">oss
	 * docs</a>.
	 */
	private ClientBuilderConfiguration config;

	public AliCloudAuthorizationMode getAuthorizationMode() {
		return authorizationMode;
	}

	public void setAuthorizationMode(AliCloudAuthorizationMode authorizationMode) {
		this.authorizationMode = authorizationMode;
	}

	public ClientBuilderConfiguration getConfig() {
		return config;
	}

	public void setConfig(ClientBuilderConfiguration config) {
		this.config = config;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public StsToken getSts() {
		return sts;
	}

	public void setSts(StsToken sts) {
		this.sts = sts;
	}

	public static class StsToken {

		private String accessKey;

		private String secretKey;

		private String securityToken;

		public String getAccessKey() {
			return accessKey;
		}

		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		public String getSecretKey() {
			return secretKey;
		}

		public void setSecretKey(String secretKey) {
			this.secretKey = secretKey;
		}

		public String getSecurityToken() {
			return securityToken;
		}

		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

	}

}