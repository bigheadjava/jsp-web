package com.cheer;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class PrintSiteFilter implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
		// 获取初始化参数
        String site = filterConfig.getInitParameter("site"); 

        // 输出初始化参数
        System.out.println("网站名称: " + site); 
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 输出站点名称
        System.out.println("站点网址：http://www.cheer.com");

        // 把请求传回过滤链
        chain.doFilter(request,response);
		
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
