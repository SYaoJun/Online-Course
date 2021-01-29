package com.example.business.controller.admin;

import com.example.server.domain.Info;
import com.example.server.domain.Chapter;
import com.example.server.dto.ChapterDto;
import com.example.server.service.InfoService;
import com.example.server.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yaojun
 * @create 2021-01-28 19:37
 */
@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @RequestMapping("/chapterTest")
    public List<ChapterDto> chapterTest(){
        return chapterService.getAllInfo();
    }
}
