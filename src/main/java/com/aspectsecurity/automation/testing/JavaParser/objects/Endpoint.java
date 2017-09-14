package com.aspectsecurity.automation.testing.JavaParser.objects;

import java.util.ArrayList;

public class Endpoint {

	private String name;
	private String url;
	private String clazzName;
	private ArrayList<String> consumes = new ArrayList<String>();
	private ArrayList<String> produces = new ArrayList<String>();
	private ArrayList<Parameter> headers = new ArrayList<Parameter>();
	private ArrayList<Parameter> params = new ArrayList<Parameter>();
	private ArrayList<String> methods = new ArrayList<String>();
	
	
	public Endpoint(String url, ArrayList<String> methods, Parameter ... parameter){
		this.url = url;
		this.methods = methods;
	
		for(Parameter param : parameter){
			params.add(param);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getConsumes() {
		return consumes;
	}

	public ArrayList<String> getProduces() {
		return produces;
	}

	public void setProduces(ArrayList<String> produces) {
		this.produces = produces;
	}
	
	public void addProduces(String produces) {
		this.produces.add(produces);
	}

	public ArrayList<String> getMethods() {
		return methods;
	}

	public void setMethods(ArrayList<String> methods) {
		this.methods = methods;
	}
	
	public void addMethod(String methods) {
		this.methods.add(methods);
	}

	public void setConsumes(ArrayList<String> consumes) {
		this.consumes = consumes;
	}
	
	public void addConsumes(String consumes) {
		this.consumes.add(consumes);
	}
	
	public Endpoint() {
		// TODO Auto-generated constructor stub
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ArrayList<Parameter> getParams() {
		return params;
	}
	public void setParams(ArrayList<Parameter> params) {
		this.params = params;
	}

	public ArrayList<Parameter> getHeaders() {
		return headers;
	}

	public void setHeaders(ArrayList<Parameter> headers) {
		this.headers = headers;
	}
	
	public void addHeaders(Parameter header){
		this.headers.add(header);
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}


	
	
	
}