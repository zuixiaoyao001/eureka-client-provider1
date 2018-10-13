package com.zxy.demo.proapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 醉逍遥
 *
 */
@RestController
public class HelloWorldController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * @return
	 */
	@RequestMapping(value="/welcome")
	public String getWelcome() {
		String str = "hello,welcome the world!!!";
		logger.info(str);
		System.out.println(str);
		return str;
	}

}
