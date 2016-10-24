package gof.tcpstate;

public class TCPEstablished extends TCPState{
	protected static TCPEstablished instance = null;
	public static TCPEstablished Instance() {
		if (null == TCPEstablished.instance) {
			TCPEstablished.instance = new TCPEstablished();
		}
		return TCPEstablished.instance;
	}
	
}
