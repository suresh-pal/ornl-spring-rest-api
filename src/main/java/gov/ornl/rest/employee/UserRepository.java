package gov.ornl.rest.employee;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
	

}
