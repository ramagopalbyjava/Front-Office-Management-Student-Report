package com.ashoikIt.frontOffice.service;

public interface UserService {

	public String Login(LoginFofm form);

	public String Signup(SignupForm form);

	public String UnlockAccount(UnlockForm form);

	public String ForgotPwd(String  email);

}
