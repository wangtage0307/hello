package com.itheima.service.impl;

import com.itheima.dao.ItemsMapper;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemsService {
    @Autowired
    ItemsMapper itemsMapper;
    public Items findById(int id) {
        return itemsMapper.findById(id);
    }
}
