package Demo01;

public class T4 implements Runnable {
    private int count = 10;


    public  /*synchronized */void m() {


        //等同于在方法的代码执行时要synchronized(this)
        count--;
        System.out.println(Thread.currentThread().getName() + "count=" + count);
    }

    public static void main(String[] args) {
        T4 t = new T4();
        for (int i = 0; i < 5; i++) {
            new Thread(t, "dsadas" + i).start();
        }
    }

    //	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
    @Override
    public void run() {
        // TODO Auto-generated method stub

    }

}
