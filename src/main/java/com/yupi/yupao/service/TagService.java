package com.yupi.yupao.service;

import com.yupi.yupao.model.domain.Tag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author 24421
* @description 针对表【tag(标签)】的数据库操作Service
* @createDate 2023-09-30 20:17:15
*/
public interface TagService extends IService<Tag> {

    List<Map<String, Object>> getOriginTagList();
}
