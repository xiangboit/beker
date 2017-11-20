package com.mingjiang.beker.testmybaties;

import org.apache.ibatis.annotations.*;

/**
 * Created by Administrator on 2017/11/14.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);
    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
    @Update("update user set age=#{age},name=#{name}")
    int update(@Param("name")String name, @Param("age") Integer age);
}
