package model.receiver;

import model.Game;
import controller.command.ChatCommand;

public class BuildReceiver extends CommandReceiver {

	public BuildReceiver(Game myGame) {
		super(myGame);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gameAction(ChatCommand cmd) {
		// TODO Auto-generated method stub
		super.getGame().buildAction(cmd);
	}
}
