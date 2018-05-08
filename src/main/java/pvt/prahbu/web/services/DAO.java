package pvt.prahbu.web.services;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface DAO<T> {
	
	public  int add(T t)throws DataNotFoundException;
	public 	boolean delete(int id) throws DataNotFoundException;
	public  boolean update(T t) throws DataNotFoundException;
	public 	T load(int id) throws DataNotFoundException;
	public List<T> loadallRecords(Date sDate,Date eDate) throws DataNotFoundException;
	public long monthlyCount(Month mon) throws DataNotFoundException, ParseException;
}
