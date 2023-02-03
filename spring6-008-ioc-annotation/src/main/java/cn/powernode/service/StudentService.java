package cn.powernode.service;

import cn.powernode.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author iyeee
 * @Date 2023/2/4 0:34
 * @Version 1.0.1
 */
@Service
public class StudentService {
    // @Resource(name = "studentDaoImplForMySQL")
    private StudentDao studentDao;
    public void deleteStudent(){
        studentDao.deleteById();
    }
    // 没有指定名字 则名字默认为属性本身的名字
    @Resource(name = "studentDaoImplForMySQL")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
