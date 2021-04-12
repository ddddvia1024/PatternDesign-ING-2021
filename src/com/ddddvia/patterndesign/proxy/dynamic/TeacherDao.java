package com.ddddvia.patterndesign.proxy.dynamic;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("ÀÏÊ¦ÊÚ¿ÎÖĞ");
    }
}
