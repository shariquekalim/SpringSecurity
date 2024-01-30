package com.security.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.Pojo.User;

@Service
public class UserService {

	List<User> list = List.of(new User(101, "Sharique", "Sharique@gmail.com", "6458675867"),
			new User(102, "Kashif", "kashif@gmail.com", "5675896"),
			new User(103, "Danish", "danish@gmail.com", "8593458"),
			new User(104, "Asim", "asim@gmail.com", "57384539"));

	public List<User> getAllUser() {
		return list;

	}

	public User getById(int id) {

		return list.stream().filter((user) -> user.getId() == id).findAny().orElse(null);
	}

	public User addUser(User user) {
		list.add(user);
		return user;
	}

}
