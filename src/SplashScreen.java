
public class SplashScreen {
	private ConnexionManager cm;
	private String nickname;
	
	public SplashScreen()
	{
		cm = new ConnexionManager();
	}
	public void onValidate()
	{
		if(cm.isUsed(nickname))
		{
			
		}
		else
		{
			cm.connect(nickname);
		}
	}
	public void update()
	{
		
	}
	public void display()
	{
		
	}
	
}
