package com.example.server.service;

import com.example.server.domain.Info;
import com.example.server.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaojun
 * @create 2021-01-28 22:45
 */
@Service
public class InfoService {
    @Autowired
    private InfoMapper infoMapper;
    public List<Info> getAllInfo(){
        return infoMapper.getAllInfo();
    }
}
