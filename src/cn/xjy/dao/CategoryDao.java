package cn.xjy.dao;

import java.sql.SQLException;
import java.util.List;

import cn.xjy.bean.Category;

public interface CategoryDao {
	
	
	/**
	 * 查询所有分类
	 * @return
	 * @throws SQLException 
	 */
	List<Category> findAll() throws SQLException;
}
