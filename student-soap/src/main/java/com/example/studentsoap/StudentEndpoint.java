package com.example.studentsoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
 
import com.example.studentsoap.Book.GetBookRequest;
import com.example.studentsoap.GetBookResponse;
 
@Endpoint

public class StudentEndpoint {
	
	private static final String NAMESPACE_URI = "http://www.jeovine.org/book";
	 
	private StudentRepository studentRepository;
 
	@Autowired
	public StudentEndpoint(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
 
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
	@ResponsePayload
	public GetStudentResponse getCountry(@RequestPayload GetStudentRequest request) {
		GetStudentResponse response = new GetStudentResponse();
		response.setStudent(studentRepository.findStudentById(request.getId()));
		return response;
	}

}
