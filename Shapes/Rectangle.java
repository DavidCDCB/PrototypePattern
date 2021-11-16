package Prototype.Shapes;

public class Rectangle extends Shape {
	public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void view(){
		System.out.println("X: "+this.x+"\nY: "+this.y+"\nWidth: "+this.width+"\nHeight: "+this.height);
	}

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
	
}
