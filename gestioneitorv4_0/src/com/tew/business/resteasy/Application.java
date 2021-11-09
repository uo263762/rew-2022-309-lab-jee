package com.tew.business.resteasy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import impl.tew.business.resteasy.AlumnosServicesRsImpl;

public class Application extends javax.ws.rs.core.Application {
	
	private Set<Class<?>> classes = new HashSet<Class<?>>();

	public Application() {
		// TODO Auto-generated constructor stub
		this.classes.add(AlumnosServicesRsImpl.class);
	}

	public Set<Class<?>> getClasses() {
		return classes;
	}

	public Set<Object> getSingletons() {
		return Collections.EMPTY_SET;
	}
	
	

}
