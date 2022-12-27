package net.lintford.library.lintfordbox2d.instances;

import org.jbox2d.collision.shapes.Shape;

public interface ShapeInstance {

	public abstract Shape shape();

	public abstract void loadPhysics();

	public abstract void savePhysics();

	public abstract ShapeInstance getCopy();

}
