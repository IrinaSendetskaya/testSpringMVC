package by.htp.testSpringMVC.testSpringMVC.dao;

import java.util.List;

public interface BaseDao <T>{

	void create(T entity);
	T read (int id);
	void update (T entity);
	void delete (T entity);
	
	List <T>readAll();
	
}

