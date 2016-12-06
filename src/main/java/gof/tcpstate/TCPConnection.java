package gof.tcpstate;

public class TCPConnection {
	private TCPState tcpState;
	public TCPConnection() {
		this.tcpState = TCPClosed.Instance();
	}
	public void ChangeState(TCPState s) {
		this.tcpState = s;
	}
	public void ActiveOpen() {
		this.tcpState.ActiveOpen(this);
	}
	public void PassiveOpen() {
		this.tcpState.PassiveOpen(this);
	}
	public void Close() {
		this.tcpState.Close(this);
	}
	public void Acknowlege() {
		this.tcpState.Acknowledge(this);
	}
	public void Synchronize() {
		this.tcpState.Synchronize(this);
	}
	public void ProcessOctect(TCPOctetStream tcpOctetStream) {
		this.tcpState.Transmit(this);
	}
}
