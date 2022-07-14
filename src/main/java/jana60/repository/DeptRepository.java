package jana60.repository;

import org.springframework.stereotype.Repository;

import jana60.model.Department;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface DeptRepository extends CrudRepository<Department, Integer>{

}
