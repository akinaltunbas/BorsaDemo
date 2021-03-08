package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthorizationInterceptor extends HandlerInterceptorAdapter  {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("preHandle# "+request.getRequestURI());
		
		if(request.getRequestURI().indexOf("admin")>0) {
			System.out.println("preHandle# admin sayfasýna girildi");
			if(request.getSession().getAttribute("authority")==null || !(request.getSession().getAttribute("authority").equals("admin"))) {
				
				//String contextPath=request.getContextPath();
				response.sendRedirect("/BorsaDemo/login");
				
				return false;
			}
		}
		
		
		if(request.getRequestURI().indexOf("user")>0) {
			System.out.println("preHandle# user sayfasýna girildi");
			if(request.getSession().getAttribute("authority")==null || !(request.getSession().getAttribute("authority").equals("user"))) {
				
				//String contextPath=request.getContextPath();
				response.sendRedirect("/BorsaDemo/login");
				return false;
			}
		}

		
		return true;
	}
	
	
}