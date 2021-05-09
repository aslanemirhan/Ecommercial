package homework5.core.concretes;

import homework5.core.abstracts.LoginService;
import homework5.googleLogger.GoogleLogger;

public class GoogleLoginManager implements LoginService{

	@Override
	public void Login() {
		
		GoogleLogger manager= new GoogleLogger();
		manager.log();
	}

}
