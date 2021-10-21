package com.how2java.test;
 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
 
 
public class TestSpring {
 
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        CategoryDAO dao = (CategoryDAO) context.getBean("dao");
        Category c = new Category();
        c.setName("category huang");
        
        //Insert
        dao.save(c);
        
        //Get
        Category c2 = dao.get(Category.class, 8);
        
        //Update
        c2.setName(" yi");
        dao.update(c2);
        
        //Delete
        //dao.delete(c2);
        
        

    }
}