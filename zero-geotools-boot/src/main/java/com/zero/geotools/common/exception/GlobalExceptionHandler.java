package com.zero.geotools.common.exception;

import com.zero.geotools.common.result.ResponseResult;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常捕获处理类
 */
@CrossOrigin
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ResponseResult processException(Exception ex, HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ResponseResult(400, ex);
	}

}
