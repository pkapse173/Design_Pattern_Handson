package design_ChainOfRes;

public class Program {
	
	public static void main(String[] args) {
		
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmpName("Pranav Kapse");
		leaveRequest.setNoOfdays(4);
		ILeaveRequestHandler supervisor = new Supervisor();
		supervisor.HandleRequest(leaveRequest);
		
	}

}
