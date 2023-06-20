package com.faintdream.mybatis.web.filter;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * 过滤器，设置响应类型和编码方式
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public class Filter01 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 设置响应类型(html)和编码方式(UTF-8)
        response.setContentType("text/html;charset=UTF-8");

        // 测试代码
        // System.out.println("Filter01");

        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
