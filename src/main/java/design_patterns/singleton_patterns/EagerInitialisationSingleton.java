package design_patterns.singleton_patterns;

/*
It is important to remember that anything that involves a static initialisation
object will be eagerly loaded i.e. as soon as our program executes static initialisations
will take place.

The example below relates simply providing access throughout your
 */

public class EagerInitialisationSingleton {

	private static final EagerInitialisationSingleton instance = new EagerInitialisationSingleton();

	public static EagerInitialisationSingleton getInstance() {
		return instance;
	}

}