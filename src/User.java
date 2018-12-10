
public class User {
	private String nickname;
	private int status;
	private String ip;
	
	public User(String nickname)
	{
		this.nickname = nickname;
		this.status = 0;
	}
	public void changeNickname(String nickname)
	{
		this.nickname = nickname;
	}
	public void setConnected()
	{
		this.status = 1;
	}
	public void setDisconnected()
	{
		status = 0;
	}
	
}
