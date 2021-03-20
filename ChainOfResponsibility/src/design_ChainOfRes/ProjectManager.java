package design_ChainOfRes;

public class ProjectManager implements ILeaveRequestHandler{
	
	private ILeaveRequestHandler nextHandler = new HR();
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		int id = leaveRequest.getNoOfdays();
		if(id<5)
			System.out.println("Leave Approved for : "+leaveRequest.getEmpName());
		else
			nextHandler.HandleRequest(leaveRequest);
	}

}
