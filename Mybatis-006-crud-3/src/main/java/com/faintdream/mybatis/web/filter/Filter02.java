package com.faintdream.mybatis.web.filter;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * 过滤器，过滤 jsp 和 html 文件
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */

public class Filter02 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //如果是.jsp和html文件(bank目录下),回到主页
        request.getRequestDispatcher("/no-access").forward(request,response);

        // 测试代码
         System.out.println("Filter02");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
