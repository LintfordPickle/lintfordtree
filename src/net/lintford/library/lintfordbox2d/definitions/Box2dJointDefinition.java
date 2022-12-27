package net.lintford.library.lintfordbox2d.definitions;

import org.jbox2d.dynamics.joints.JointDef;

public class Box2dJointDefinition {

	// --------------------------------------
	// Variables
	// --------------------------------------

	public JointDef jointDef;
	public String name;
	public int bodyAIndex;
	public int bodyBIndex;

	public boolean collideConnected;

	// --------------------------------------
	// Constructor
	// --------------------------------------

	public Box2dJointDefinition() {

	}
}
