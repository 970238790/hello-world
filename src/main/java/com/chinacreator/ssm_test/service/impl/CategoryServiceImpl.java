package com.chinacreator.ssm_test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinacreator.ssm_test.mapper.CategoryMapper;
import com.chinacreator.ssm_test.pojo.Category;
import com.chinacreator.ssm_test.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	}


}
