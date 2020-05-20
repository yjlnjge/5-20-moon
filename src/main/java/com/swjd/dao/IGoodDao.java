package com.swjd.dao;

import com.swjd.pojo.Good;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGoodDao {
    Good findOne(int id);

    int add(Good good);

    int update(Good good);

    int delete(int id);

    List<Good> findByName(Good good);
}
