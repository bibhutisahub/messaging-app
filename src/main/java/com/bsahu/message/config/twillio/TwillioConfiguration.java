package com.bsahu.message.config.twillio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bsahu
 *
 */
@Configuration
public class TwillioConfiguration {

	@Bean
	public TwillioBean getTwillioBean() {
		return new TwillioBean();
	}
	
	
}
