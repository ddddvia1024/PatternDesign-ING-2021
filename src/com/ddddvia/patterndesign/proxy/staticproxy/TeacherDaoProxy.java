package com.ddddvia.patterndesign.proxy.staticproxy;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class TeacherDaoProxy implements  ITeacherDao {
    private ITeacherDao teacherDao;
    @Override
    public void teach() {
        teacherDao.teach();
    }

    public TeacherDaoProxy(ITeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }
}
