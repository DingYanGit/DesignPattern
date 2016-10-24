package gof.tcpstate;

public class TCPListen extends TCPState{
	protected static TCPListen instance = null;
	public static TCPListen Instance() {
		if (null == TCPListen.instance) {
			TCPListen.instance = new TCPListen();
		}
		return TCPListen.instance;
	}

}
