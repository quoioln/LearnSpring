/**
 * 
 */
package com.quoioln.jdbcframework;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author quoioln
 *
 */
public class StudentDAOImp implements StudentDAO {
	private String TABLE = "Student";
	private String ID = "id";
	private String NAME = "name";
	private String AGE = "age";
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void add(Student student) {
		String sql = "insert into " + TABLE + "(" + NAME + ", " + AGE +")" + "values(?, ?)";
		jdbcTemplateObject.update(sql, student.getName(), student.getAge());
		System.out.println("Add student success");
	}

	@Override
	public int update(Student student) {
		String sql = "update " + TABLE + " set " + NAME + " = ? " 
					+ ", " + AGE + " = ? " + " where " + ID + " = ?" ;
		int rs = jdbcTemplateObject.update(sql, student.getName(), student.getAge(), student.getId());
		System.out.println("Update student success");
		return rs;
	}

	@Override
	public int remove(int id) {
		String sql = "delete from " + TABLE + " where " + ID + " = ?";
		int rs = jdbcTemplateObject.update(sql, id);
		System.out.println("Delete student success");
		return rs;
	}

	@Override
	public Student getStudentById(int id) {
		String sql = "select " + ID + ", " + NAME + ", " + AGE + " from " + TABLE + " where " + ID + " = ?";
		Student student = jdbcTemplateObject.queryForObject(sql, new Object[]{id}, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		String sql = "select " + ID + ", " + NAME + ", " + AGE + " from " + TABLE;
		List<Student> studentList = jdbcTemplateObject.query(sql, new StudentMapper());
		return studentList;
	}

}
