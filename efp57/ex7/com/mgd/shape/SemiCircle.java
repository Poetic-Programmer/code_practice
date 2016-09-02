package com.mgd.shape;

public class SemiCircle implements Shape{
	private float radius;

	// lock the default constructor from outside objects
	private SemiCircle(){
	}

	public SemiCircle(float radius){
		this.radius = radius;
	}

	@Override
	public float getArea(){
		return (float) (Math.PI * radius * radius * 0.5f);
	}
}
