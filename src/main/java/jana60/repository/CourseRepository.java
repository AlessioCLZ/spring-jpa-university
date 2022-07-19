package jana60.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
