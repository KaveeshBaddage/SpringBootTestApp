package com.kaveesh.testApp.filter;

import com.kaveesh.testApp.constant.AppConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;


@Slf4j
@Component
public class RequestAuditInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        long requestTime = System.currentTimeMillis();
        String requestId = request.getHeader(AppConstants.REQUEST_ID);
        request.setAttribute(AppConstants.REQUEST_START_TIME, requestTime);
        request.setAttribute(AppConstants.REQUEST_AUDIT_ID, UUID.randomUUID().toString());
        if (requestId == null || requestId.isEmpty()) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
            response.getWriter().write("{\"error\":\"Request_Id header value can not be null\"}");
            return false;
        }
        log.info("Request URL: {} , Request Start Time: {}", request.getRequestURL().toString(), requestTime);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long responseTime = System.currentTimeMillis();
        long requestTime = (long) request.getAttribute(AppConstants.REQUEST_START_TIME);
        long timeTaken = responseTime - requestTime;
        log.info("Request URL: {} , Request End Time: {} , Request Process Duration", request.getRequestURL().toString(),
                responseTime, timeTaken);
    }
}
