package xin.webtest.dao;

import java.io.Serializable;
import java.util.*;

public interface BaseDao<T> {
	//get entity by id
	T get(Class<T> entityClazz, Serializable id);
	//save the entity
	Serializable save(T entity);
	//update the entity
	void update(T entity);
	//delete the entity
	void delete(T entity);
	//delete entity by id
	void delete(Class<T> entityClazz, Serializable id);
	//get all entities
	List<T> findAll(Class<T> entityClazz);
	//get total number of entities
	long findCount(Class<T> entityClazz);
}
