package homework5.logger;

import homework5.entities.concretes.User;

public class PhoneLogger implements Logger{

	@Override
	public void Log(User user) {
		System.out.println(user.getPhoneNumber() + " : Numaraya aktivasyon kodu gönderildi ");
		
	}

}
