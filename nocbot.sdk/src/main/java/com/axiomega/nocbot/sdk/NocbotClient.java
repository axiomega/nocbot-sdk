package com.axiomega.nocbot.sdk;

import com.axiomega.nocbot.sdk.session.Account;
import com.twilio.sdk.TwilioRestClient;

public class NocbotClient {
	/** The Constant ACCOUNT_SID. */
	public static final String ACCOUNT_SID = "AC...";
	/** The Constant AUTH_TOKEN. */
	public static final String AUTH_TOKEN = "...";
	
	private TwilioRestClient _client;
	private Account _account;
	
	public NocbotClient() {
		_client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
	}
	
	public Account getAccount() {
		if(_account == null)
			_account = new Account(_client.getAccount());
		return _account;
	}

}
