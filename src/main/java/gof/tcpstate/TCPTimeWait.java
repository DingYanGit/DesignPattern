package gof.tcpstate;

public class TCPTimeWait  extends TCPState{
	protected static TCPTimeWait instance = null;
	public static TCPTimeWait Instance() {
		if (null == TCPTimeWait.instance) {
			TCPTimeWait.instance = new TCPTimeWait();
		}
		return TCPTimeWait.instance;
	}
	public void Close(TCPConnection tcpConnection) {
		System.out.println("2MSL expired");
		this.ChangeState(tcpConnection, TCPClosed.Instance());
		tcpConnection.Close();
	}
}
