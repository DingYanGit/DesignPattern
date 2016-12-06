package gof.tcpstate;

public class TCPCloseWait extends TCPState{
	protected static TCPCloseWait instance = null;
	public static TCPCloseWait Instance() {
		if (null == TCPCloseWait.instance) {
			TCPCloseWait.instance = new TCPCloseWait();
		}
		return TCPCloseWait.instance;
	}
	public void Close(TCPConnection tcpConnection) {
		System.out.println("send fin");
		ChangeState(tcpConnection, TCPTimeWait.Instance());
		tcpConnection.Close();
	}
}
