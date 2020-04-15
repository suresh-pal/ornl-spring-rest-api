package gov.ornl.rest.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {

		List<User> userList = new ArrayList<>();
		userRepository.findAll()
		.forEach(userList::add);
		return userList;
	}	
	public Optional<User> getUser(String userId) {
		return userRepository.findById(userId);
	}	
	public void deleteUser(String userId) {
		userRepository.deleteById(userId);
		
	}	
	public User addUser(User user) {
		return userRepository.save(user);
	}	
	
	public User updateUser(User user) {
		return userRepository.save(user);
	}	
}
