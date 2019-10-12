package Demo01;

public class T {
    private int count = 10;
    private Object o = new Object();

    public void main() {
        synchronized (o) {
            //任何线程想要执行下面这段代码必须先去拿O这把锁
            count--;
            System.out.println(Thread.currentThread().getName() + "count" + count);

        }
    }


}
