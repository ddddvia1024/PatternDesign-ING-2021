package com.ddddvia.patterndesign.proxy.staticproxy;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
