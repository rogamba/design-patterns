public class SingletonThreadSafe {
    private volatile static SingletonThreadSafe instance;

    private SingletonThreadSafe() {}

    public getInstance() {
        if(instance == null){
            synchronized (SingletonThreadSafe.class) {
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}