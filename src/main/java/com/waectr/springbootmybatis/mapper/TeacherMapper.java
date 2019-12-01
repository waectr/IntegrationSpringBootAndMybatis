package com.waectr.springbootmybatis.mapper;

import com.waectr.springbootmybatis.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {

    public Teacher getTeacherById(Integer id);

}
