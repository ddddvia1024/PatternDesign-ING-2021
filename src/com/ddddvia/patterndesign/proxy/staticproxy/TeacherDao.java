package com.ddddvia.patterndesign.proxy.staticproxy;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("原老师教课");
    }
}
