package org.lhl.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
 * helloControllerTwo是一个基于注解的控制器
 * 可以同时 处理多个请求动作，并且无需实现任何借口
 * org.springframework.stereotype.Controller注解用于指示该类是一个控制器
 * */
@Controller
public class helloControllerTwo {
	private static final Log logger = LogFactory.getLog(helloControllerTwo.class);
/*
 * org.springframework.web.bind.annotation.RequestMapping注解
 * 用来映射其他请求的URL和请求的方法等，本例用来映射"/hello"
 * hello只是一个普通方法
 * 该方法返回一个包含视图名或视图名和模型的ModelAndView*/
	@RequestMapping(value="/hello")
	public ModelAndView hello() {
		logger.info("hello 方法被调用");
		//创建准备返回的ModelAndView对象，该对象通常包含了返回视图名、模型的名称以及模型对象
		ModelAndView mv = new ModelAndView();
		//添加模型数据，可以是任意的POJO对象
		mv.addObject("message","hell world too");
		//设置逻辑视图名，试图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("welcome");
		return mv;
	}
	@RequestMapping(value="/byebye")
	public ModelAndView byebye() {
		logger.info("hello 方法被调用");
		//创建准备返回的ModelAndView对象，该对象通常包含了返回视图名、模型的名称以及模型对象
		ModelAndView mv = new ModelAndView();
		//添加模型数据，可以是任意的POJO对象
		mv.addObject("message","byebye world too");
		//设置逻辑视图名，试图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("bye");
		return mv;
	}
	
}
