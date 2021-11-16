package Prototype.Shapes;

public class Circle extends Shape {
    private int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
	
	public void setRadius(int radius) {
		this.radius = radius;
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

	public void view() {
		System.out.println("X: "+this.x+"\nY: "+this.y+"\nRadius: "+this.radius);
	}

}
