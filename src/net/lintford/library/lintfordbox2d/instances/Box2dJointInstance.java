package net.lintford.library.lintfordbox2d.instances;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;
import org.jbox2d.dynamics.joints.Joint;

import net.lintford.library.core.LintfordCore;
import net.lintford.library.core.entity.instances.IndexedPooledBaseData;

public abstract class Box2dJointInstance extends IndexedPooledBaseData {

	// --------------------------------------
	// Constants
	// --------------------------------------

	private static final long serialVersionUID = -5442409523175676125L;

	// --------------------------------------
	// Variables
	// --------------------------------------

	public String name;
	public transient Joint joint;

	public int bodyAUid;
	public int bodyBUid;

	public final Vec2 localAnchorA = new Vec2();
	public final Vec2 localAnchorB = new Vec2();

	public boolean collidesConnected;

	// --------------------------------------
	// Constructor
	// --------------------------------------

	public Box2dJointInstance(int poolUid) {
		super(poolUid);
	}

	// --------------------------------------
	// Method
	// --------------------------------------

	public void savePhysics() {
		if (joint == null) {
			return;

		}

		collidesConnected = joint.getCollideConnected();

	}

	public void loadPhysics(World box2dWorld) {

	}

	public abstract void unloadPhysics(World box2dWorld);

	public abstract void update(LintfordCore core);

}
