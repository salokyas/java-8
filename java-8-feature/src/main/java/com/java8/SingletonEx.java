package com.java8;

public class SingletonEx {

	public static void main(String[] args) {
//		MapperObject mapperObject = MapperObject.INSTANCE.getMapper();
		
		System.out.println(MapperObject.INSTANCE.getMapper().hashCode());
		System.out.println(MapperObject.INSTANCE.getMapper().hashCode());
		System.out.println(MapperObject.INSTANCE.getMapper().hashCode());
		System.out.println(MapperObject.INSTANCE.getMapper().hashCode());
		
	}
}
