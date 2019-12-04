package demo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("用于测试");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDate.now());
    }
}