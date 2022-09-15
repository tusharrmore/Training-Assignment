package com.assignment;

public class Box {
	
	private int width;
	
	private int height;
	
	private int depth;

	

	public Box(int width, int height, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	
	public int getVolume() {
        return this.depth*this.width*this.height;
    }
    
    public static void main(String[] args) {
        Box b=new Box(4, 3, 5);
        System.out.println("Volume= "+b.getVolume());
    }

}
