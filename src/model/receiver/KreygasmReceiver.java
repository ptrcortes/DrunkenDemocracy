package model.receiver;

import model.Game;
import controller.command.ChatCommand;

public class KreygasmReceiver extends CommandReceiver {

	public KreygasmReceiver(Game myGame) {
		super(myGame);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gameAction(ChatCommand cmd) {
		super.getGame().kreygasmAction(cmd);
	}
}
