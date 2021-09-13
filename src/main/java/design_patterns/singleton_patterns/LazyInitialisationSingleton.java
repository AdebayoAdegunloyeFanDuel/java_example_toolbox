package design_patterns.singleton_patterns;

/*
Lazy initialisation relates to objects that are only instantiated on request.

The example below shows how with static and a simple if statement can provide
what is referred as 'Lazy Loading'. In short the aim is to only instantiate the object
when is it called and if it isn't then processes/memory can be saved.
 */

public class LazyInitialisationSingleton {

	private static LazyInitialisationSingleton instance;

	private LazyInitialisationSingleton() {

	}

	public static LazyInitialisationSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitialisationSingleton();
		}
		return instance;
	}

}
