package net.lintford.library.lintfordbox2d.pools;

import net.lintford.library.core.entity.instances.IndexedPoolInstanceManager;
import net.lintford.library.lintfordbox2d.instances.Box2dRevoluteInstance;

public class Box2dRevJointInstanceRepository extends IndexedPoolInstanceManager<Box2dRevoluteInstance> {

	// --------------------------------------
	// Constants
	// --------------------------------------

	private static final long serialVersionUID = -6599971326126027895L;

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

	public Box2dRevJointInstanceRepository() {
		mPoolUidCounter = 0;
	}

	// --------------------------------------
	// Methods
	// --------------------------------------

	@Override
	protected Box2dRevoluteInstance createPoolObjectInstance() {
		return new Box2dRevoluteInstance(getNewPoolUid());
	}

}
