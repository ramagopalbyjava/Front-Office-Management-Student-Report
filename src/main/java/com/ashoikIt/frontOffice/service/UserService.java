package com.ashoikIt.frontOffice.service;

import com.ashoikIt.frontOffice.bindings.LoginForm;
import com.ashoikIt.frontOffice.bindings.SignupForm;
import com.ashoikIt.frontOffice.bindings.UnlockForm;

public interface UserService {

	public String Login(LoginForm form);

	public String Signup(SignupForm form);

	public String UnlockAccount(UnlockForm form);

	public String ForgotPwd(String  email);

}
