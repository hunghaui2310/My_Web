package com.vienmv.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.vienmv.model.AppUser;
@WebFilter(urlPatterns="/admin/*")
public class SecurityFilter implements Filter {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resq= (HttpServletResponse) response;
		HttpSession session = req.getSession();
		Object obj=session.getAttribute("account");
		AppUser user=(AppUser) obj;
		
		if(user !=null && user.getRoleId()==1 ) {
			chain.doFilter(request, response);
			return; //
		}else {
			resq.sendRedirect(req.getContextPath()+ "/logout");
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}
	

}
