package com.bms.raukten.model;

public interface Rewards {
	int POINTS=6700;		//by default in interface a, final static
	void redeem();			//by default public and abstract
}

interface A
{
	void aa();
}
interface B extends A
{
	void bb();
}