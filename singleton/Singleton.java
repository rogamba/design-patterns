/**
 * All there is to know is that the constructor is private
 * and can only be accessed from  within the class. So we
 * do it through a static method, evaluating if a class var
 * already has the instance object, if so return that object.
 * 
 * If we want the code to be thread safe, we isntance the object
 * eagerly (on the variable definition instead of on the getInstace
 * method).
 * 
 */
public class Singleton {
    public static Singleton instance;

    private Singleton() {}

    public getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}