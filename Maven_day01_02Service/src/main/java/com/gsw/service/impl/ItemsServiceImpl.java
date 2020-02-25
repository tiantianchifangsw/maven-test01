package com.gsw.service.impl;

import com.gsw.dao.ItemsDao;
import com.gsw.domain.Items;
import com.gsw.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
