package com.poo2integrador.minerva.Servicios;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.poo2integrador.minerva.MinervaApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	/*
	 * @Override
	 * protected SpringApplicationBuilder configure(SpringApplicationBuilder
	 * application) {
	 * return application.sources(MinervaApplication.class);
	 * }
	 */

	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { MinervaApplication.class };
	}

	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
