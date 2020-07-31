
public class MemberBean {
private String email,psw, psw_repeat;

public MemberBean() {
	super();
}

public MemberBean(String email, String psw, String psw_repeat) {
	super();
	this.email = email;
	this.psw = psw;
	this.psw_repeat = psw_repeat;
}


public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPsw() {
	return psw;
}

public void setPsw(String psw) {
	this.psw = psw;
}

public String getPsw_repeat() {
	return psw_repeat;
}

public void setPsw_repeat(String psw_repeat) {
	this.psw_repeat = psw_repeat;
}



}
