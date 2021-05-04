package com.bsahu.message.config.twillio;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author bsahu
 *
 */
public class TwillioBean {
	@Value("${twillio.account.sid}")
	private String accountSid;
	@Value("${twillio.auth.tocken}")
	private String authToken;
	@Value("${twillio.trial.number}")
	private String trialNumber;
	
	public TwillioBean() {
	}
	public TwillioBean(String accountSid, String authToken, String trialNumber) {
		super();
		this.accountSid = accountSid;
		this.authToken = authToken;
		this.trialNumber = trialNumber;
	}
	public String getAccountSid() {
		return accountSid;
	}
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getTrialNumber() {
		return trialNumber;
	}
	public void setTrialNumber(String trialNumber) {
		this.trialNumber = trialNumber;
	}
}
