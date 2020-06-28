package com.rohan.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 * This will be singleton.
 * 
 * @author rohan
 *
 */
@Service
public class TopicService {

	// Error : We got an immutable list
	/*
	 * private List<Topic> topics = Arrays.asList(new Topic("spring",
	 * "spring-framework", "Spring Framework Description"), new Topic("java",
	 * "Core Java", "Core Java Description"), new Topic("angular", "Angular js",
	 * "Angular JS Description"));
	 */

	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("spring", "spring-framework", "Spring Framework Description"),
					new Topic("java", "Core Java", "Core Java Description"),
					new Topic("angular", "Angular js", "Angular JS Description")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(temp -> temp.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(temp -> temp.getId().equals(id));
	}

}
