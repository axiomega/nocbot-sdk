package com.axiomega.nocbot.sdk.session;

import java.util.Map;


public class CallFactory {
	private com.twilio.sdk.resource.factory.CallFactory _callFactory;

	public CallFactory(com.twilio.sdk.resource.factory.CallFactory callFact) {
		_callFactory = callFact;
	}
	
	public Call create(Map<String, String> params) throws NocbotRestException {
		Call call = null;
		try {
			call = new Call(_callFactory.create(params));
		}catch(Exception e) {
			throw (NocbotRestException)e;
		}
		return call;
	}
}
