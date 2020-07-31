package cn.xjy.service.impl;

import java.sql.SQLException;
import java.util.List;

import cn.xjy.bean.Category;
import cn.xjy.dao.CategoryDao;
import cn.xjy.dao.impl.CategoryDaoImpl;
import cn.xjy.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	private CategoryDao dao = new CategoryDaoImpl();
	
	@Override
	public List<Category> findAll() {
		try {
			return dao.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
