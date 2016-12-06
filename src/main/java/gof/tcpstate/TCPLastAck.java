package gof.tcpstate;

public class TCPLastAck extends TCPState{
	protected static TCPLastAck instance = null;
	public static TCPLastAck Instance() {
		if (null == TCPLastAck.instance) {
			TCPLastAck.instance = new TCPLastAck();
		}
		return TCPLastAck.instance;
	}
	public void Close(TCPConnection tcpConnection) {
		System.out.println("receive ack and wait for 2MSL");
		ChangeState(tcpConnection, TCPTimeWait.Instance());
		this.Close(tcpConnection);
	}
}
