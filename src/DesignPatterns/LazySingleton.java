package DesignPatterns;


public class LazySingleton {

    //保证 instance 在所有线程中同步
    private static volatile LazySingleton instance = null;
    //volatile 修改的值会立刻更新到RAM中,确保可见性

    //private 构造器私有,避免类在外部被实例化
    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
