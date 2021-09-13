package design_patterns.singleton_patterns;

/*
The aim of a singleton instance is to ensure that only one object is created and
then ensuring the same instance is being accessed when your program is running.
It essentially stops multiple instances being available.

When would you use this? when wanted to ensure a synchronous connection with something
or ensuring your are able to pass around a connection type such as a selenium driver
or JDBC connection.
 */


public class BPSingleton {

    // As you can see below within our class we have created a private static class
    // This will be eagerly loaded upon program creation and is private to our
    // BPSingleton class
    private static class SingletonHelper{
        // Within the SingleHelper class we create an instance of the outer
        // BPSingleton class and is static final to ensure it's loaded at the start of
        // our program and final to ensure it cannot be changed.
        private static final BPSingleton singletonHelper = new BPSingleton();
    }

    // in our BPSingleton class we simply make a method that returns the
    // and instantiated version of our BPSingleton class which then exposes an instance
    public static BPSingleton getInstance(){
        return SingletonHelper.singletonHelper;
    }


}
