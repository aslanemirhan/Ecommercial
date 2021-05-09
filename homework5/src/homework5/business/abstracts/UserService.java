package homework5.business.abstracts;

import homework5.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void registiration(User user);
	void getUserInfo(User user);
}
