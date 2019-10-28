package com.java8;

import com.fasterxml.jackson.databind.ObjectMapper;

public enum MapperObject {
	INSTANCE;
	private final ObjectMapper mapper = new ObjectMapper();

	public ObjectMapper getMapper() {
		return mapper;
	}
}
