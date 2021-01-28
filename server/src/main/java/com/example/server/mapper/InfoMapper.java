package com.example.server.mapper;

import com.example.server.domain.Info;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yaojun
 * @create 2021-01-28 22:39
 */
@Mapper
public interface InfoMapper {
    public List<Info> getAllInfo();
}
