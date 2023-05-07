package com.faintdream.bank.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * 转账异常错误
 * @author faintdream
 * @version 1.0
 * @since 1.0
 * */
public class TransferExceptionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 请求转发
        request.getRequestDispatcher("/bank/transfer-exception.html").forward(request,response);
    }
}
