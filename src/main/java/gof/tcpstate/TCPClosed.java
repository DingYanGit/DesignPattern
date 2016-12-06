package gof.tcpstate;

public class TCPClosed extends TCPState{
	protected static TCPClosed instance = null;
	public static TCPClosed Instance() {
		if (null == TCPClosed.instance) {
			TCPClosed.instance = new TCPClosed();
		}
		return TCPClosed.instance;
	}
	public void ActiveOpen(TCPConnection tcpConnection) {
		this.ChangeState(tcpConnection, TCPEstablished.Instance());
	}
	public void PassiveOpen(TCPConnection tcpConnection) {
		System.out.println("listen");
		this.ChangeState(tcpConnection, TCPListen.Instance());
	}
	public void Close(TCPConnection tcpConnection) {
		System.out.println("tcp closed, now listen for a new connection");
		this.ChangeState(tcpConnection, TCPListen.Instance());
	}
	public void Transmit(TCPConnection tcpConnection, TCPOctetStream tcpOctetStream) {
		tcpConnection.ProcessOctect(tcpOctetStream);
	}
	public void Send(TCPConnection tcpConnection) {
		this.ChangeState(tcpConnection, TCPEstablished.Instance());
	}
}
