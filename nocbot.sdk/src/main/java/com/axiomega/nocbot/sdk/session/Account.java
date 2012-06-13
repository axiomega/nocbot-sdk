package com.axiomega.nocbot.sdk.session;

public class Account {
	private com.twilio.sdk.resource.instance.Account _account = null;
	private CallFactory _callFactory = null;

	public Account(com.twilio.sdk.resource.instance.Account acct) {
		_account = acct;
	}
	
	public CallFactory getCallFactory() {
		if(_callFactory == null)
			_callFactory = new CallFactory(_account.getCallFactory());
		return _callFactory;
	}
}
