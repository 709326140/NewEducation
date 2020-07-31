package cn.xjy.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.xjy.bean.Category;
import cn.xjy.dao.CategoryDao;
import cn.xjy.util.JdbcUtil;

public class CategoryDaoImpl implements CategoryDao {
	QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
	
	@Override
	public List<Category> findAll() throws SQLException {
		String sql = "select * from e_category";
		return qr.query(sql, new BeanListHandler<Category>(Category.class));
	}

}
