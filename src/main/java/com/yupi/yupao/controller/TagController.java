package com.yupi.yupao.controller;

import com.yupi.yupao.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tag")
@CrossOrigin(origins = {"http://localhost:3000"})
@Slf4j
public class TagController {
    @Resource
    private TagService tagService;

    @GetMapping("/list")
    public List<Map<String, Object>> getOriginTagList() {
        List<Map<String, Object>> tags = tagService.getOriginTagList();
        return tags;
    }
}
