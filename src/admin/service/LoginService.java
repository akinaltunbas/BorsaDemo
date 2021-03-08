package admin.service;

import javax.servlet.http.HttpServletRequest;

import formModel.LoginModel;

public interface LoginService {
	
	public int loginUsernameControl(LoginModel loginModel,HttpServletRequest request);
	
	public void logOut(HttpServletRequest request);

}
