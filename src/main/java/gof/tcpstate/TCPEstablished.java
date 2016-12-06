package gof.tcpstate;

public class TCPEstablished extends TCPState{
	protected static TCPEstablished instance = null;
	public static TCPEstablished Instance() {
		if (null == TCPEstablished.instance) {
			TCPEstablished.instance = new TCPEstablished();
		}
		return TCPEstablished.instance;
	}
	public void Transmit(TCPConnection tcpConnection) {
		System.out.println("transmit data");
	}
	public void Close(TCPConnection tcpConnection) {
		System.out.println("receive fin");
		System.out.println("send ack");
		ChangeState(tcpConnection, TCPCloseWait.Instance());
		tcpConnection.Close();
	}
}
