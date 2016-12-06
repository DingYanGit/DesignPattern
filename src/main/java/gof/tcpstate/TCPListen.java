package gof.tcpstate;

public class TCPListen extends TCPState{
	protected static TCPListen instance = null;
	protected int syn = 0;
	public static TCPListen Instance() {
		if (null == TCPListen.instance) {
			TCPListen.instance = new TCPListen();
		}
		return TCPListen.instance;
	}
	public void ActiveOpen(TCPConnection tcpConnection) {
		System.out.println("receive a ack, connection is established");
		this.ChangeState(tcpConnection, TCPEstablished.Instance());
	}
	public void Synchronize(TCPConnection tcpConnection) {
		System.out.println("receive a syn");
		this.syn = 1;
		System.out.println("send back a syn plus ack");
		this.ChangeState(tcpConnection, TCPListen.Instance());
	}
	public void Acknowledge(TCPConnection tcpConnection) {
		System.out.println("receive a ack");
		System.out.println("connection is established");
		if(this.syn == 1) {
			this.ChangeState(tcpConnection, TCPEstablished.Instance());
		}
	}
}
