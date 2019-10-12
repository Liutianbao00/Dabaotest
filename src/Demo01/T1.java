package Demo01;

import java.util.concurrent.atomic.AtomicInteger;

public class T1 {
    //	private int count = 10;
//	
//	
//	public void main() {
//		synchronized (this ) {
//			//任何线程想要执行下面这段代码必须先去拿O这把锁
//			count--;
//			System.out.println(Thread.currentThread().getName()+"count"+count);
//			
//		}
//	}
//	
    private static AtomicInteger count = new AtomicInteger(0);

    private static void main() {
        for (int i = 0; i < 10000; i++) {

            count.incrementAndGet();//count++;

        }
    }

    public static void main(String[] args) {
        T1.main();
        System.out.println(count);
    }


}
