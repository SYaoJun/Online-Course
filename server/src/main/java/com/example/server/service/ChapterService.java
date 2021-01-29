package com.example.server.service;

import com.example.server.domain.Chapter;
import com.example.server.domain.ChapterExample;
import com.example.server.mapper.ChapterMapper;
import com.example.server.mapper.ChapterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaojun
 * @create 2021-01-29 09:21
 */
@Service
public class ChapterService {
    @Autowired
    private ChapterMapper chapterMapper;

    public List<Chapter> getAllInfo(){
        ChapterExample chapterExample = new ChapterExample();
        /*按照条件查找id=1的元素返回*/
        chapterExample.createCriteria().andIdEqualTo("1");
        /*按照id的降序*/
//        chapterExample.setOrderByClause("id desc");
        return chapterMapper.selectByExample(chapterExample);
    }
}
