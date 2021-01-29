package com.example.server.service;

import com.example.server.domain.Chapter;
import com.example.server.domain.ChapterExample;
import com.example.server.dto.ChapterDto;
import com.example.server.mapper.ChapterMapper;
import com.example.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yaojun
 * @create 2021-01-29 09:21
 */
@Service
public class ChapterService {
    @Autowired
    private ChapterMapper chapterMapper;

    public List<ChapterDto> getAllInfo(){
        ChapterExample chapterExample = new ChapterExample();

        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        List<ChapterDto> chapterDtoList = new ArrayList<>();
        for (int i = 0; i < chapterList.size(); i++) {
            Chapter chapter = chapterList.get(i);
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter, chapterDto);
            chapterDtoList.add(chapterDto);
        }
        return chapterDtoList;
    }
}
