package homework5.validation.concretes;



import java.util.regex.Pattern;

import homework5.entities.concretes.User;
import homework5.validation.abstracts.ValidationService;

public class ValidationManager implements ValidationService{

	@Override
	public boolean checkUserIsValid(User user) {
		if(checkEmail(user.getEmail()) && checkSizeOfPassword(user.getPassword()) && checkSizeOfName(user.getName()) && checkSizeOfSurname(user.getLastName())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkEmail(String email) {
		String regex = "^(.+)@(.+)$";
		 if(Pattern.matches(regex,email))
	        {
	            return true;
	        }
	        else
	        {
	            return  false;
	        }
		
	}

	@Override
	public boolean checkSizeOfPassword(String password) {
		if(password.length() < 6) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean checkSizeOfName(String Name) {
		if(Name.length() < 2) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public boolean checkSizeOfSurname(String Surname) {
		if(Surname.length() < 2) {
			return false;
		}else {
			return true;
		}
		
	}

}
