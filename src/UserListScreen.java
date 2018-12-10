import java.util.Vector;

public class UserListScreen {
	
	private Vector<ChatScreen> chats;
	private ConnexionManager cm;
	
	public UserListScreen(ConnexionManager cm)
	{
		this.cm = cm;
		chats = new Vector<>();
	}
	public void onOtherUserSelection(String otheruser)
	{
		if(cm.connectTo(otheruser))
		{
			chats.add(new ChatScreen(otheruser));
		}
		
	}
	
}
