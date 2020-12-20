package com.example.studentsoap;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
 
 
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
 
import com.example.studentsoap.Student;
 
@Component
public class StudentRepository {
	private static final Map<Integer, Student> students = new HashMap<>();
	 
	@PostConstruct
	public void initData() {
		
		Student javaStudent = new Student();
		javaStudent.setId(1);
		javaStudent.setTitle("Head first java");
		javaStudent.setPages(400);
		Students.put(javaStudent.getId(), javaStudent);
		
		Student springStudent = new Student();
		springStudent.setId(2);
		springStudent.setTitle("Spring in action");
		springStudent.setPages(400);
		Students.put(springStudent.getId(), springStudent);
		
		Student pythonStudent = new Student();
		pythonStudent.setId(3);
		pythonStudent.setTitle("Learning Python");
		pythonStudent.setPages(400);
		Students.put(pythonStudent.getId(), pythonStudent);
		
		Student hiberanteStudent = new Student();
		hiberanteStudent.setId(4);
		hiberanteStudent.setTitle("Hibernate in action");
		hiberanteStudent.setPages(400);
		Students.put(hiberanteStudent.getId(), hiberanteStudent);
	}
 
	public Student findStudentById(int id) {
		Assert.notNull(id, "The Student's name must not be null");
		return Students.get(id);
	}
}
