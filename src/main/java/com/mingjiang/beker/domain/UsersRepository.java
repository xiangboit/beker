package com.mingjiang.beker.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2017/11/13.
 */
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
    Users findByAge(Integer age);
    Users findByNameAndAge(String name, Integer age);

    @Query("from Users u where u.name=:name")
    Users findUser(@Param("name") String name);
}