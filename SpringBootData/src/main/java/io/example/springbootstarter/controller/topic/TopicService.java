/**
 * 
 */
package io.example.springbootstarter.controller.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jayap
 *
 */
@Service 
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	
	public List<Topic> getAllTopics()
	{
		
		//return topics;
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().iterator()
		.forEachRemaining(topics::add);
		return topics;
				
	}
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicRepository.save(topic);
		
	}

	public void updateTopic(String id,Topic topic) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}*/
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}

}
