package com.mingjiang.beker.web;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/11/13.
 */
@ControllerAdvice
class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error";
    /**
     *控制器增强，===========应用到所有@RequestMapping注解的方法，在其抛出UnauthenticatedException异常时执行
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
}