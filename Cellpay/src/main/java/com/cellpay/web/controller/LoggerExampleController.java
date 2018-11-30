package com.cellpay.web.controller;



import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoggerExampleController {

	private static final Logger logger = Logger.getLogger(LoggerExampleController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView getWelcome() {
		
		if(logger.isDebugEnabled()) {
			logger.debug("getWelcome is executed!");
		}
		
		logger.error("This is Error Message", new Exception("Testing"));
		
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("msg", "Hello Spring MVC + Log4j");
		return model;
	}
}
