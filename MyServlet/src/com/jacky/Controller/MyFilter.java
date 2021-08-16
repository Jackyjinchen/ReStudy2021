package com.jacky.Controller;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpResp = (HttpServletResponse) servletResponse;
        if (true) {
            httpResp.sendError(400, "无权访问");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
