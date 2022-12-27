package net.lintford.library.lintfordbox2d.definitions;

import org.jbox2d.dynamics.FixtureDef;

import net.lintford.library.lintfordbox2d.instances.ShapeInstance;

public class Box2dFixtureDefinition {

	// --------------------------------------
	// Variables
	// --------------------------------------

	public String name;
	public FixtureDef fixtureDef = new FixtureDef();
	public ShapeInstance shape;

	// --------------------------------------
	// Constructor
	// --------------------------------------

	public Box2dFixtureDefinition() {

	}
}
