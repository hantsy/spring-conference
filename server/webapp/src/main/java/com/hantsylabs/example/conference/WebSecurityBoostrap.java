package com.hantsylabs.example.conference;

import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Order(2)
public class WebSecurityBoostrap extends
		AbstractSecurityWebApplicationInitializer {

}
