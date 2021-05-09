package homework5.validation.abstracts;

import homework5.entities.concretes.User;

public interface ValidationService {
	boolean checkUserIsValid(User user);
	boolean checkEmail(String email);
	boolean checkSizeOfPassword(String password);
	boolean checkSizeOfName(String Name);
	boolean checkSizeOfSurname(String Surname);
	
}
