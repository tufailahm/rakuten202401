package com.bms.raukten.model;

public abstract class Animal {
	int age;
	public void sleep() {
		System.out.println("Sleep for 8 hours");
	}
	
	public abstract void eat() ;
}
abstract class Cat extends Animal {

	@Override
	public void eat() {
	}
	public abstract void speak() ;
}
class Tiger extends Cat
{

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}
	
}