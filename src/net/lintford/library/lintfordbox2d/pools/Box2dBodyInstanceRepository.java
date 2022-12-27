package net.lintford.library.lintfordbox2d.pools;

import net.lintford.library.core.entity.instances.IndexedPoolInstanceManager;
import net.lintford.library.lintfordbox2d.instances.Box2dBodyInstance;

public class Box2dBodyInstanceRepository extends IndexedPoolInstanceManager<Box2dBodyInstance> {

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

	public Box2dBodyInstanceRepository() {
		mPoolUidCounter = 0;
	}

	// --------------------------------------
	// Methods
	// --------------------------------------

	@Override
	protected Box2dBodyInstance createPoolObjectInstance() {
		return new Box2dBodyInstance(getNewPoolUid());
	}

}
