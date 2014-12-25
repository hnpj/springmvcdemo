package com.my.DAO;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.hql.ast.tree.FromClause;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.my.xml.User;
import com.sun.org.apache.bcel.internal.generic.Select;

/**
 * @author tydic
 *
 */
public class UserDAOImp  implements UserDAO{
    @Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;
    
	/* (non-Javadoc)
	 * @see com.my.DAO.UserDAO#insertUser(com.my.xml.User)
	 */
	public void insertUser(User user) {
        this.getHibernateTemplate().save(user);		
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public User getUserbyId(int id) {
		return this.getHibernateTemplate().get(User.class, id);
	}
	public User getUserbyIdandName(int id,String name  ) {
		return (User) this.getHibernateTemplate().find("Select * From B_USER where id="+id+"and name="+name);
	}
	

}
