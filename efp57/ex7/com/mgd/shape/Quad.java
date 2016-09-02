package com.mgd.shape;

public class Quad implements Shape{
	private float width, height;

	// lock the default constructor from outside objects
	private Quad(){
	}

	public Quad(float width, float height){
		this.width = width;
		this.height = height;
	}

	@Override
	public float getArea(){
		return width * height;
	}
}
