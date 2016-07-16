/**
 * 
 */
package jdbcframework;

import javax.sql.DataSource;

/**
 * @author quoioln
 *
 */
public interface StudentDAO {
	
	/**
	 * This method is used to initialize 
	 * database resources connection 
	 */
	void setDataSource(DataSource ds);
	
	/**
	 * This method is used to add student
	 */
	public void add(Student student);
	
	/**
	 * This method is used to update student
	 */
	public void update(Student student);
	
	/**
	 * This method is used to remove student
	 */
//	public void remove(Integer )
	
	/**
	 * This method is used to get student by id
	 */
	
	/**
	 * This method is used to get all student
	 */
}
