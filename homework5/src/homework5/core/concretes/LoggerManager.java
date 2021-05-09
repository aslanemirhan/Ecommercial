package homework5.core.concretes;

import homework5.core.abstracts.LoggerService;
import homework5.entities.concretes.User;
import homework5.logger.Logger;

public class LoggerManager implements LoggerService{
	
	 Logger  logger;
	

	public LoggerManager(Logger logger) {
		super();
		this.logger = logger;
	}


	@Override
	public void Log(User user) {
		this.Log(user);
		
	}

}
