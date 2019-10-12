package 单例设计模式;


public class singLeton {
    //懒汉式
    private static volatile singLeton instance;

    private singLeton() {

    }

    public static singLeton getInstance() {
        if (instance == null) {
            synchronized (singLeton.class) {
                if (instance == null) {
                    instance = new singLeton();
                }
            }
        }
        return instance;

    }


}
