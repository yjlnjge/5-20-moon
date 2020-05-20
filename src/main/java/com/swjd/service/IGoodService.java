package com.swjd.service;

import com.swjd.pojo.Good;

import java.util.List;

public interface IGoodService {
    Good findOne(int id);

    int add(Good good);

    int update(Good good);

    int delete(int id);

    List<Good> findByName(Good good);
}
