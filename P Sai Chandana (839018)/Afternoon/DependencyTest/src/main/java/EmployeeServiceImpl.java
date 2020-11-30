
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao ed;

	public void setEd(EmployeeDao ed) {
		this.ed = ed;
	}

	public void storeEmployee() {
		System.out.println("Calling from EmployeeService");
		ed.store();
	}

}
