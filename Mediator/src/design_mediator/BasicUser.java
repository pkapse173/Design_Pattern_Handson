package design_mediator;

public class BasicUser implements IUser {
	
	private ChatMediator chatMediator;
	private String name;

	public BasicUser() {
		super();
	}

	@Override
	public void recieveMessage(String msgr) {
		
		System.out.println(name+ " recieved : "+msgr);

	}

	@Override
	public void sendMessage(String msg) {

		chatMediator.sendMessage(msg);

	}

	public BasicUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

}

