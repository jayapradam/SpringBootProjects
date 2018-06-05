/**
 * 
 */
package io.example.springbootstarter.controller.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jayap
 *
 */
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {

		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId).iterator().forEachRemaining(courses::add);
		return courses;

	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course Course) {
		// TODO Auto-generated method stub
		courseRepository.save(Course);

	}

	public void updateCourse(Course Course) {
		// TODO Auto-generated method stub
		courseRepository.save(Course);

	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		courseRepository.delete(id);
	}

}
