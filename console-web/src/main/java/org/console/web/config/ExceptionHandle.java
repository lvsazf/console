package org.console.web.config;

import org.console.framework.model.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 统一异常处理
 * @author lzs
 * 2018年6月19日下午3:43:50
 */
@ControllerAdvice(annotations = RestController.class)
public class ExceptionHandle {
	
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result<String> handle(Exception e){
		return new Result<>(false, "789", e.getMessage());
	}
	
}
