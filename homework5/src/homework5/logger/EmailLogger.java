package homework5.logger;

import homework5.entities.concretes.User;

public class EmailLogger implements Logger{

	@Override
	public void Log(User user) {
		System.out.println(user.getEmail() + " : Mail adresine aktivasyon linki gönderildi");
		
	}

}
