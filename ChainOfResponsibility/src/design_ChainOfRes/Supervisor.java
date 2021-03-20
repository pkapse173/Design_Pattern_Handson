package design_ChainOfRes;

public class Supervisor implements ILeaveRequestHandler{
	
	private ILeaveRequestHandler nextHandler = new ProjectManager();
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		int id = leaveRequest.getNoOfdays();
		
		if(id > 0 && id < 3)
		{
			System.out.println("Leave Approved by Supervisor for : " +leaveRequest.getEmpName());
			
		}else if(id>=3)
			nextHandler.HandleRequest(leaveRequest);
	}

}
