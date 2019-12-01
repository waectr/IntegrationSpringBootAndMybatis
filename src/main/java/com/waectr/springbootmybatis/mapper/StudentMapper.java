package com.waectr.springbootmybatis.mapper;

import com.waectr.springbootmybatis.bean.Student;
import org.apache.ibatis.annotations.*;

@Mapper //指定这是一个注解的操作数据库的mapper
public interface StudentMapper {

    @Select("select * from student where id=#{id}")
    public Student getStuById(Integer id);

    @Delete("delete from student where id=#{id}")
    public int deleteStuById(Integer id);


    @Options(useGeneratedKeys = true,keyProperty = "id")  //开启自动增长
    @Insert("insert into student values(null,#{name},#{age})")
    public int insertStu(Student student);

    @Update("update student set name=#{name},age=#{age} where id=#{id}")
    public int updateStu(Student student);

}