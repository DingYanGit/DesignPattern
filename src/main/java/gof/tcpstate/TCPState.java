package gof.tcpstate;

public abstract class TCPState {
	public void Transmit(TCPConnection tcpConnection) {
		
	}
	public void ActiveOpen(TCPConnection tcpConnection) {
		
	}
	public void PassiveOpen(TCPConnection tcpConnection) {
		
	}
	public void Close(TCPConnection tcpConnection) {
		
	}
	public void Synchronize(TCPConnection tcpConnection) {
		
	}
	public void Acknowledge(TCPConnection tcpConnection) {
		
	}
	public void ChangeState(TCPConnection tcpConnection, TCPState state) {
		tcpConnection.ChangeState(state);
	}
}
