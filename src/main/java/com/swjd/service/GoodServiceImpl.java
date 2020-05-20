package com.swjd.service;

import com.swjd.dao.IGoodDao;
import com.swjd.pojo.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements IGoodService {
    @Autowired
    private IGoodDao iGoodDao;

    @Override
    public Good findOne(int id) {
        return iGoodDao.findOne(id);
    }

    @Override
    public int add(Good good) {
        return iGoodDao.add(good);
    }

    @Override
    public int update(Good good) {
        return iGoodDao.update(good);
    }

    @Override
    public int delete(int id) {
        return iGoodDao.delete(id);
    }

    @Override
    public List<Good> findByName(Good good) {
        return iGoodDao.findByName(good);
    }
}
