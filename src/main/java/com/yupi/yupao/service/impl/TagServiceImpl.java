package com.yupi.yupao.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.yupao.mapper.TagMapper;
import com.yupi.yupao.model.domain.Tag;
import com.yupi.yupao.service.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 24421
 * @description 针对表【tag(标签)】的数据库操作Service实现
 * @createDate 2023-09-30 20:17:15
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
        implements TagService {
    @Resource
    private TagMapper tagMapper;

    @Override
    public List<Map<String, Object>> getOriginTagList() {

        List<Tag> tags = tagMapper.selectList(null);

        // 构建标签树形结构
        List<Map<String, Object>> tagList = new ArrayList<>();
        Map<Long, Map<String, Object>> tagMap = new HashMap<>();

        for (Tag tag : tags) {
            Map<String, Object> tagItem = new HashMap<>();
            BeanUtils.copyProperties(tag, tagItem);
            tagItem.put("text", tag.getTagName());
            tagItem.put("id", tag.getId());
            tagMap.put(tag.getId(), tagItem);

            if (tag.getParentId() == 0) {
                tagList.add(tagItem);
            } else {
                Map<String, Object> parentTag = tagMap.get(tag.getParentId());
                if (parentTag != null) {
                    List<Map<String, Object>> children = (List<Map<String, Object>>) parentTag.getOrDefault("children", new ArrayList<>());
                    children.add(tagItem);
                    parentTag.put("children", children);
                }
            }
        }

        return tagList;
    }
}


