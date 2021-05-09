package homework5.business.concretes;



import homework5.business.abstracts.UserService;
import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;
import homework5.logger.Logger;
import homework5.validation.abstracts.ValidationService;

public class UserManager implements UserService{

	UserDao userDao;
	Logger logger;
	ValidationService valuesCheckService;
	
	public UserManager() {}
	
	
	public UserManager(UserDao userDao, Logger logger, ValidationService valuesCheckService) {
		super();
		this.userDao = userDao;
		this.logger = logger;
		this.valuesCheckService = valuesCheckService;
	}


	@Override
	public void add(User user) {
		if(valuesCheckService.checkUserIsValid(user)) {
			userDao.add(user);
			System.out.println("Database' ye eklendi");
		}else {
			System.out.println("Lütfen doðru formatta girin");
		}
		
	}

	@Override
	public void delete(User user) {
		if(valuesCheckService.checkUserIsValid(user)) {
			userDao.add(user);
			System.out.println("Database' den silindi");
		}else {
			System.out.println("Lütfen doðru formatta girin");
		}
		
	}

	@Override
	public void registiration(User user) {
		if(valuesCheckService.checkUserIsValid(user)) {
			logger.Log(user);
			System.out.println("Email aktivasyon kodu gönderilmiþtir");
		}else {
			System.out.println("Lütfen doðru formatta girin");
		}
		
	}

	@Override
	public void getUserInfo(User user) {
		System.out.println(user.getName() + " " + user.getLastName() + " listeye baþarýyla eklendi.");
		
	}

}
