package a_006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {
        //这个是没有加锁的arraylist集合
        List<String> list = new ArrayList<>();
        //这个是加锁的Arrayli集合
        List<String> synlist = Collections.synchronizedList(list);
        synlist.add("a");


    }
}
