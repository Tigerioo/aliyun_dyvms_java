/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SingleCallByVoiceRequest extends RpcAcsRequest<SingleCallByVoiceResponse> {
	
	public SingleCallByVoiceRequest() {
		super("Dyvmsapi", "2017-05-25", "SingleCallByVoice");
	}

	private String calledNumber;

	private String resourceOwnerAccount;

	private String voiceCode;

	private String calledShowNumber;

	private Long resourceOwnerId;

	private Long ownerId;

	private String outId;

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getVoiceCode() {
		return this.voiceCode;
	}

	public void setVoiceCode(String voiceCode) {
		this.voiceCode = voiceCode;
		if(voiceCode != null){
			putQueryParameter("VoiceCode", voiceCode);
		}
	}

	public String getCalledShowNumber() {
		return this.calledShowNumber;
	}

	public void setCalledShowNumber(String calledShowNumber) {
		this.calledShowNumber = calledShowNumber;
		if(calledShowNumber != null){
			putQueryParameter("CalledShowNumber", calledShowNumber);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getOutId() {
		return this.outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		if(outId != null){
			putQueryParameter("OutId", outId);
		}
	}

	@Override
	public Class<SingleCallByVoiceResponse> getResponseClass() {
		return SingleCallByVoiceResponse.class;
	}

}
