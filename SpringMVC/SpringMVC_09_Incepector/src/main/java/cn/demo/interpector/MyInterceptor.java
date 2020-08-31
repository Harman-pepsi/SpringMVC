package cn.demo.interpector;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname MyInterceptor
 * @Description TODO
 * @Date 2020/9/1 1:05
 * @Created by XJC·AW
 */
public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("处理前 >>>>>>>>>>>>>>>>>>>");
        String requestURI = request.getRequestURI();
        //如果是登录页面则放行
        if(requestURI.toLowerCase().contains("login")){
            return true;
        }
        //如果已经登录了则也放行
        if(request.getSession().getAttribute("loginUser") != null){
            return true;
        }

        //用户没有登录 跳转到登录页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("处理后 >>>>>>>>>>>>>>>>>>>");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("清理 >>>>>>>>>>>>>>>>>>>");
    }
}
