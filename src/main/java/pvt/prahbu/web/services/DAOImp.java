package pvt.prahbu.web.services;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;



public class DAOImp<T> implements DAO<T> {

	private Class<T> clazz;
	SessionFactory sf = HibernateUtils.getSessionFactory();
	static Logger logger = null;

	public DAOImp(Class<T> clazz) {
		super();
		
		this.clazz = clazz;
		logger = Logger.getLogger(clazz);
	}

//	@Override
	public int add(T t) throws DataNotFoundException {
		logger.debug("Executing AddDao::add API");
		Session session = sf.openSession();
		session.beginTransaction();
		Serializable id = session.save(t);
		if (id == null)
			throw new DataNotFoundException("Data is failded to insert in Database");
		session.getTransaction().commit();
		session.close();
		return (int)Integer.parseInt((String) id);
	}

//	@Override
	public boolean delete(int id) throws DataNotFoundException {
		logger.debug("Executing DeleteDao::Delete API");
		Session session = sf.openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		T t = (T) session.get(clazz, id);
		session.delete(t);
		session.getTransaction().commit();
		session.close();
		return true;
	}

//	@Override
	public boolean update(T t) throws DataNotFoundException {
		logger.debug("Executing updateDAO::update API");
		Session session = sf.openSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();
		session.close();
		return true;
	}

//	@Override
	public T load(int id) throws DataNotFoundException {
		logger.debug("Executing LoadDAO::Load API");
		Session session = sf.openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		T t = (T) session.get(clazz, id);
		session.getTransaction().commit();
		session.close();
		return t;
	}

//	@Override
	public List<T> loadallRecords(Date sDate, Date eDate) throws DataNotFoundException {
		logger.debug("Executing Load All RedordsDao::Load all records API");
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(clazz);
		criteria.add(Restrictions.ge("timeStamp", sDate));
		criteria.add(Restrictions.le("timeStamp", eDate));
		@SuppressWarnings("unchecked")
		List<T> tlist = criteria.list();
		session.close();
		return tlist;
	}

//	@Override
	public long monthlyCount(Month mon) throws DataNotFoundException, ParseException {

		logger.debug("Executing MonthlyCount::Count API");
		String sdate = "2018-" + mon.getMonthNo() + "-01 00:00:00";
		String edate = "2018-" + mon.getMonthNo() + "-31 23:59:59";

		Date sDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdate);
		Date eDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(edate);
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(clazz);
		criteria.add(Restrictions.ge("timeStamp", sDate));
		criteria.add(Restrictions.le("timeStamp", eDate));
		criteria.setProjection(Projections.rowCount());
		long count = (Long) criteria.uniqueResult();
		session.close();
		return count;
	}
	
	public long monthlyCountAliter() throws DataNotFoundException, ParseException {

		logger.debug("Executing AliterMonthlyCount::Count API");
		
		Session session = sf.openSession();
		Query query=session.createQuery("select month(timeStamp) from Order where month(timeStamp) =:i "); 
		query.setParameter("i",05);
		long count = query.list().size();
		session.close();
		return count;
	}


}
