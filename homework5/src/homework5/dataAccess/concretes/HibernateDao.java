package homework5.dataAccess.concretes;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class HibernateDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(user.getName() + " " + user.getLastName() + " : adlý kullanýcýnýn kaydý oluþmuþtur ");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + " " + user.getLastName() + " : adlý kullanýcý kaydý silinmiþtir");
		
	}

}
