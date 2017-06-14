package com.mrz.util;

import java.io.IOException;
import java.math.BigDecimal;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class MyCallbackServer implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		WSPasswordCallback callback = (WSPasswordCallback) callbacks[0];
		String identifer = callback.getIdentifier();
		String[] split = identifer.split("_");
		if (split.length > 1) {
			BigDecimal clientTimestamp = new BigDecimal(split[1]);
			BigDecimal serverTimestamp = new BigDecimal(PasswordUtil.getServerTimestamp());
			BigDecimal subtract = serverTimestamp.subtract(clientTimestamp);
			int compareTo = subtract.compareTo(new BigDecimal("600000"));
			if (compareTo == -1) {
				String property = MyPropertiesUtil.getProperty(split[0]);
				String password = PasswordUtil.getMyPassword(split[0], property, split[1]);
				callback.setPassword(password);
			}
		}
	}

}
