package com.hantsylabs.example.conference;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.hantsylabs.example.conference.config.AdminWebConfig;
import com.hantsylabs.example.conference.config.CoreConfig;
import com.hantsylabs.example.conference.config.PersistenceConfig;

@Order(1)
public class AdminAppBootstrap  extends AbstractAnnotationConfigDispatcherServletInitializer

{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {CoreConfig.class, PersistenceConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AdminWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
