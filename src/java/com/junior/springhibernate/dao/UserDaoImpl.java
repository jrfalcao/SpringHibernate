package com.junior.springhibernate.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.junior.springhibernate.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	@Override
	public void saveUser(User user) {
		persist(user);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	@Override
	public void deleteUserById(Integer id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
		query.setInteger("id", id);
		query.executeUpdate();
	}

	@Override
	public User findById(Integer id) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("id",id));
		return (User) criteria.uniqueResult();
	}

	@Override
	public void updateUser(User user) {
		getSession().update(user);
	}

}
