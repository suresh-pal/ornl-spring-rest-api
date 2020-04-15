package gov.ornl.rest.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/users")
	public List<User> getAllUsers() {

		return userService.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/users/{userId}")
	public Optional<User> getSpecificUser(@PathVariable String userId) {
		return userService.getUser(userId.toUpperCase());
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/users/{userId}")
	public void updateUser(@RequestBody User user, @PathVariable String userId) {
		userService.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/users/{userId}")
	public void deleteUser(@PathVariable String userId) {
		userService.deleteUser(userId);
	}

	@RequestMapping(method=RequestMethod.POST, value="/api/users")
	public User addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
	
}
