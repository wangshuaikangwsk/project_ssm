package com.wsk.project_ssm.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PersonMapper {
    List<Map<String, Object>> getMapPersonList(Map<String, Object> paramMap);

    int getCountPersonList(Map<String, Object> paramMap);
}
