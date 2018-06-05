/**
 * 
 */
package io.example.springbootstarter.controller.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Jayap
 *
 */
public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String id);
}
