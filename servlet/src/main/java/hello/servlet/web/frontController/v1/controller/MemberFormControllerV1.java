package hello.servlet.web.frontController.v1.controller;

import hello.servlet.web.frontController.v1.ControllerV1;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberFormControllerV1 implements ControllerV1 {


    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);  // 제어권 넘겨줌, 다른 서블릿이나 jsp로 이동할 수 있는 기능, 서버 내부에서 다시 호출이 발생한다.

    }
}
