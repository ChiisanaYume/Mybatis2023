package com.faintdream.bank.web.servlet;

import com.faintdream.bank.exception.MoneyNotEnoughException;
import com.faintdream.bank.exception.TransferException;
import com.faintdream.bank.service.AccountService;
import com.faintdream.bank.service.impl.AccountServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AccountServlet extends HttpServlet {

    private final AccountService accountService = new AccountServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取表单数据
        String from_no = request.getParameter("from_no");
        String to_no = request.getParameter("to_no");
        String money = request.getParameter("money");

        //调用业务方法完成业务
        System.out.println(from_no);
        System.out.println(to_no);
        System.out.println(money);

        try {
            accountService.transfer(from_no, to_no, money);

            // 没有异常证明转账成功，显示视图(响应重定向)
            response.sendRedirect(request.getContextPath() + "/transfer-success");
        } catch (MoneyNotEnoughException e) {

            // 异常显示错误(响应重定向)
            response.sendRedirect(request.getContextPath() + "/money-not-enough-exception");
        } catch (TransferException e) {

            // 异常显示错误(响应重定向)
            response.sendRedirect(request.getContextPath() + "/transfer-exception");
        }
    }
}
