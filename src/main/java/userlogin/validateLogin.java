package userlogin;

import java.util.ResourceBundle;

public class validateLogin {
	
	public int checkUesr(String uid,String upass)
	{
		ResourceBundle rs = ResourceBundle.getBundle("con1");
		String id = rs.getString("id");
		String pass = rs.getString("pass");
		
		if (id.equals(uid) && pass.equals(upass))
				return 1;
			else
				return 0;
		}

}
