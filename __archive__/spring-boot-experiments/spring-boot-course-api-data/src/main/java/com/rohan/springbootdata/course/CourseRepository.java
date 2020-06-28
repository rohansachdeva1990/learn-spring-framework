package com.rohan.springbootdata.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Spring Data will provide the implementation
@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
	
	
	/**
	 * You don't have to implement a method! Just declare the method with the findByProperty name
	 * format and Spring DATA JPA will implement the method for us.
	 * 
	 * @param name
	 * @return
	 */
	public List<Course> findByName(String name);
	
	// The parameter name doesn't really matterz....
	public List<Course> findByDescription(String description);
	
	
	// It will go to Topic class and then Id....
	public List<Course> findByTopicId(String topicId);

	
	
	
}
