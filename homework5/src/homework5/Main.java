package homework5;

import homework5.business.abstracts.UserService;
import homework5.business.concretes.UserManager;
import homework5.dataAccess.concretes.HibernateDao;
import homework5.entities.concretes.User;
import homework5.logger.EmailLogger;
import homework5.validation.concretes.ValidationManager;

public class Main {

	public static void main(String[] args) {
		
		User user = new User("Emirhan", "Aslan", "random@gmail.com", "123456789", "05555555555");
		
		UserService userService = new UserManager(new HibernateDao(), new EmailLogger(), new ValidationManager());
		userService.add(user);
		

	}

}
