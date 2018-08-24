package com.myinterfaces;

import com.pojo.Student;

public interface StudentFileIO {

	Student [] readStudents();
	void writeStudents(Student []student);
}
