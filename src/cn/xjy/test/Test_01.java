package cn.xjy.test;

import java.util.List;

import cn.xjy.bean.Category;
import cn.xjy.service.CategoryService;
import cn.xjy.service.impl.CategoryServiceImpl;

public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoryService service = new CategoryServiceImpl();
		System.out.println(".............");
		List<Category> list = service.findAll();
		
		for (Category category : list) {
			System.out.println(category);
		}
	}

}
