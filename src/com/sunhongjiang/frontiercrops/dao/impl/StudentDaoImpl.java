package com.sunhongjiang.frontiercrops.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.sunhongjiang.frontiercrops.dao.StudentDao;
import com.sunhongjiang.frontiercrops.entity.Student;
import com.sunhongjiang.frontiercrops.util.DBHelper;

public class StudentDaoImpl implements StudentDao {

	private static final Logger LOGGER = LogManager.getLogger(StudentDaoImpl.class);

	public static void main(String[] args) {
		StudentDaoImpl aaa = new StudentDaoImpl();
		Student student = new Student(100, "AJ", 25);
		aaa.addStudent(student);
	}

	@Test
	@Override
	public void addStudent(Student student) {
		Connection conn = DBHelper.getInstance().getConnection();

		String sql = "INSERT INTO tbl_student VALUES(?, ?, ?)";

		PreparedStatement ps = null;

		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getAge());
			result = ps.executeUpdate();
			LOGGER.debug(sql);
		}

		catch (Exception e) {
			LOGGER.catching(e);
		}

		finally {
			DBHelper.closeStatement(ps);
		}
	}

}
