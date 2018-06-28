package com.sunhongjiang.frontiercrops.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunhongjiang.frontiercrops.dao.ApplyDao;
import com.sunhongjiang.frontiercrops.entity.Apply;

@Transactional
@Repository("applyDaoImpl")
public class ApplyDaoImpl extends HibernateDaoSupport implements ApplyDao {

	@Autowired
	private SessionFactory sf;

	@Override
	public void audit(Apply apply) {
		sf.getCurrentSession().saveOrUpdate(apply);
	}

	@Override
	public Apply detail(String id) {
		return (Apply) this.sf.getCurrentSession().get(Apply.class, id);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<Apply> search(String applier, String title) {
		List<Apply> list = new ArrayList();
		if (applier.equals("") || applier.equals(null)) {
			String sql = "select a from Apply where title like ?";
			list = sf.getCurrentSession().createQuery(sql).setParameter(1, "%" + title + "%").list();
			return list;
		} else {
			String sql = "select a from Apply where applier like ?";
			list = sf.getCurrentSession().createQuery(sql).setParameter(1, "%" + applier + "%").list();
			return list;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Apply> searchAll() {
		String hql = "SELECT a FROM Apply a";
		return sf.getCurrentSession().createQuery(hql).list();

	}

	// Dao实现类继承了HibernateDaoSupport接口，如果Dao或配置文件中没有'sessionFactory'或者'hibernateTemplate'就会报错
	@Resource
	public void setSessionFacotry(SessionFactory sessionFacotry) {
		super.setSessionFactory(sessionFacotry);
	}

}
