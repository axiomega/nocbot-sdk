package com.axiomega.nocbot.sdk.session;

public class Call {
	private com.twilio.sdk.resource.instance.Call _call = null;

	public Call(com.twilio.sdk.resource.instance.Call call) {
		_call = call;
	}
	
	public String getSid() {
		return _call.getSid();
	}
}
