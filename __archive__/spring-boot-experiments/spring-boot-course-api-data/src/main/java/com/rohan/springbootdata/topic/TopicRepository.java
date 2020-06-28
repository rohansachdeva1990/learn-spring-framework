package com.rohan.springbootdata.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Spring Data will provide the implementation
@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{
}
