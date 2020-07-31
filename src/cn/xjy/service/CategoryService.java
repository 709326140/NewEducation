package cn.xjy.service;

import java.util.List;

import cn.xjy.bean.Category;

public interface CategoryService {
	
	
	/**
	 * 查询所有分类
	 * @return
	 */
	List<Category> findAll();
}
