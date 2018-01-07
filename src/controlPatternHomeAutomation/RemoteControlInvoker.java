package controlPatternHomeAutomation;

public class RemoteControlInvoker {

	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControlInvoker() {
		
		int numCommands = 7;
		
		onCommands = new Command[numCommands];
		offCommands = new Command[numCommands];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < numCommands; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onC, Command offC) {
		onCommands[slot] = onC;
		offCommands[slot] = offC;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n-----Remote Control-----\n");
		for (int i = 0; i < onCommands.length; i++)
			sb.append("[slot" + i + "] " + onCommands[i].getClass().getName()
					+ "   " + offCommands[i].getClass().getName() + "\n");
		
		return sb.toString();
	}
	
}