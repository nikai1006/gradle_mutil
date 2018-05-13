package cn.net.nikai.gradle.manager;

import cn.net.nikai.gradle.service.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     test
 * </pre>
 *
 * @author <a href="nikai.net.cn">nikai</a>
 * @version V1.0.0 2018/5/11 23:32
 */
public class Controller {
    private Service service;

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(1);
        list.add("1");
        list.add("2");

        list.forEach(s -> System.out.println(s));
        list.sort(String::compareToIgnoreCase);

        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < 100; i++) {
            
        }
    }
}
