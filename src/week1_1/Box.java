package week1_1;

public class Box {
	
	private double height, length, width;
	
	public Box(double width, double length, double height){
		this.height = height;
		this.length = length;
		this.width = width;
	}

	public double volume() {
        return length*width*height;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

	
	public static void main(String[] args) {
		Box b = new Box(5,8,3);
		System.out.println("The width of the box is "+b.getWidth());
		System.out.println("The length of the box is "+b.getLength());
		System.out.println("The height of the box is "+b.getHeight());
		System.out.println("The volume of the box is "+b.volume());
	}

}
