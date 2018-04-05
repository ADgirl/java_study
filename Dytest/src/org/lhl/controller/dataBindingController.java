package org.lhl.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dataBindingController {
	private static final Log logger = LogFactory.getLog(dataBindingController.class);
	@RequestMapping(value="/pathVariableTest/{userId}")
	public void pathVariableTest(@PathVariable Integer userId) {
		logger.info("通过@PathVariable获得数据:"+userId);
	}
	
	
	@RequestMapping(value="/requestHeaderTest")
	public void requestHeaderTest(
			@RequestHeader("user-Agent") String userAgent,
			@RequestHeader(value="Accept") String[] accepts) {
		logger.info("通过@requestHeaderTest获得数据:"+userAgent);
		for(String accept :accepts) {
			logger.info(accept);
		}
		
	}
	
	@RequestMapping(value="/cookieValuesTest")
	public void cookieValuesTest(
			@CookieValue(value="JSESSIONID",defaultValue="") String sessionId) {
		logger.info("通过@cookieValuesTest获得数据:"+sessionId);
	}
	
}
