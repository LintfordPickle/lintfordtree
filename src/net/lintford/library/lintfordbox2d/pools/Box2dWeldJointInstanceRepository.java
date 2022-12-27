package net.lintford.library.lintfordbox2d.pools;

import net.lintford.library.core.entity.instances.IndexedPoolInstanceManager;
import net.lintford.library.lintfordbox2d.instances.Box2dWeldInstance;

public class Box2dWeldJointInstanceRepository extends IndexedPoolInstanceManager<Box2dWeldInstance> {

	// --------------------------------------
	// Constants
	// --------------------------------------

	private static final long serialVersionUID = -4810983362341455019L;

	// --------------------------------------
	// Variables
	// --------------------------------------

	private int mPoolUidCounter;

	// --------------------------------------
	// Properties
	// --------------------------------------

	private int getNewPoolUid() {
		return mPoolUidCounter++;
	}

	// --------------------------------------
	// Constructor
	// --------------------------------------

	public Box2dWeldJointInstanceRepository() {
		mPoolUidCounter = 0;
	}

	// --------------------------------------
	// Methods
	// --------------------------------------

	@Override
	protected Box2dWeldInstance createPoolObjectInstance() {
		return new Box2dWeldInstance(getNewPoolUid());
	}

}
