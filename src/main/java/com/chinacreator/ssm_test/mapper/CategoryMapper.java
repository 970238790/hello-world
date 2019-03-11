package com.chinacreator.ssm_test.mapper;
 
import java.util.List;

import com.chinacreator.ssm_test.pojo.Category;
import com.chinacreator.ssm_test.util.Page;
 
public interface CategoryMapper {
 
      
    public int add(Category category);  
       
      
    public void delete(int id);  
       
      
    public Category get(int id);  
     
      
    public int update(Category category);   
       
      
    public List<Category> list();
      
}