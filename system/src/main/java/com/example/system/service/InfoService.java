package com.example.system.service;

import com.example.system.domain.Info;
import com.example.system.mapper.InfoMapper;
import com.netflix.discovery.converters.Auto;
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
