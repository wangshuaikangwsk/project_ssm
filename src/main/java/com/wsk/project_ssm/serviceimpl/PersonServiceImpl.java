package com.wsk.project_ssm.serviceimpl;

import com.wsk.project_ssm.mapper.PersonMapper;
import com.wsk.project_ssm.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {

    @Resource
    PersonMapper personMapper;

    @Override
    public List<Map<String, Object>> getMapPersonList(Map<String, Object> paramMap) {
        return personMapper.getMapPersonList(paramMap);
    }

    @Override
    public int getCountPersonList(Map<String, Object> paramMap) {
        return personMapper.getCountPersonList(paramMap);
    }

}
