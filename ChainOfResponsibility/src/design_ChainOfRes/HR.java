package design_ChainOfRes;

public class HR implements ILeaveRequestHandler{
	
	private ILeaveRequestHandler nextHandler = null;
	
	public void HandleRequest(LeaveRequest leaveRequest) {
		
		int id = leaveRequest.getNoOfdays();
		if(id>=7)
			System.out.println("Contact HR for your Leave Request");
		else
			System.out.println("Leave Approved by HR for : " +leaveRequest.getEmpName());
		
	}
}
