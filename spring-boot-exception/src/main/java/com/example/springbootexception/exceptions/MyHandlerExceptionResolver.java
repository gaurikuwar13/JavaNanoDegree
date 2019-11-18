package com.example.springbootexception.exceptions;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        if(e instanceof java.lang.ArithmeticException) mv.setViewName("mathError");
        else if (e instanceof java.lang.NullPointerException) mv.setViewName("nullPointer");
        mv.addObject("exception",e.toString());
        return mv;
    }
}
