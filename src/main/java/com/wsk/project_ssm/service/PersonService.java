package com.wsk.project_ssm.service;

import java.util.List;
import java.util.Map;

public interface PersonService {
    List<Map<String, Object>> getMapPersonList(Map<String, Object> paramMap);

    int getCountPersonList(Map<String, Object> paramMap);
}
