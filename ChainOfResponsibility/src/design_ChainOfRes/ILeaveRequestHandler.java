package design_ChainOfRes;

public interface ILeaveRequestHandler {
	
	ILeaveRequestHandler iLeaveRequestHandler = null;
	
	void HandleRequest(LeaveRequest leaveRequest);

}
