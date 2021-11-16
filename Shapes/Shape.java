package Prototype.Shapes;

import Prototype.IPrototype;

public abstract class Shape implements IPrototype {
	protected int x;
    protected int y;
    protected String color;

    public Shape() {}

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();
}
