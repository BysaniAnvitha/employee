package employee_project;

//import epam2024.designation;
//import epam2024.employe;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employe[] data=new employe[7];
		data[0]=new employe(1001,"Ashish","01/04/2009","e","R&D",20000,8000,3000);
		data[1]=new employe(1002,"Sushma","23/08/2012","c","PM",30000,12000,9000);
		data[2]=new employe(1003,"Rahul","12/11/2008","k","Acct",10000,8000,1000);
		data[3]=new employe(1004,"Chahat","29/01/2013","r","FrontDesk",12000,6000,2000);
		data[4]=new employe(1005,"Ranjan","16/07/2005","m","Engg",50000,20000,20000);
		data[5]=new employe(1006,"Suman","1/1/2000","e","Manufacturing",23000,9000,4400);
		data[6]=new employe(1007,"Tanmay","12/06/2006","c","PM",29000,12000,10000);
		designation[] desig=new designation[5];
		desig[0]=new designation("e","Engineer",20000);
		desig[1]=new designation("c","Consultant",32000);
		desig[2]=new designation("k","Clerk",12000);
		desig[3]=new designation("r","Receptionist",15000);
		desig[4]=new designation("m","Manager",40000);
		int id=Integer.parseInt(args[0]);
		boolean set=false;
		for(int i=0;i<data.length;i++) {
			employe temp=data[i];
			if(temp.getEmpid()==id) {
				set=true;
				String name=temp.getEmpname();
				String dept=temp.getDepartment();
				String code=temp.getDesignationcode();
				int da1=0;
				String designation1="";
				for(int j=0;j<desig.length;j++) {
					if(desig[i].getDesignationCode().equals(code)) {
						designation1=desig[i].getDesignation();
						da1=desig[i].getDa();
					}
				}
				int salary=temp.getBasic()+temp.getHra()+da1-temp.getIt();
				System.out.println("Emp No.\t\tEmp Name\t\tDepartment\t\tDesignation\t\tSalary");
				System.out.println(id+"\t\t"+name+"\t\t\t"+dept+"\t\t"+designation1+"\t\t"+salary);
				break;
			}
		
		}
		if(set==false)
			System.out.println("There is no employee with empid : "+id);
	}

}
class employe{
	int empid;
	String empname;
	String date;
	String designationcode;
	String department;
	int basic;
	int hra;
	int it;
	public employe(int empid, String empname, String date, String designationcode, String department, int basic,
			int hra, int it) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.date = date;
		this.designationcode = designationcode;
		this.department = department;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public String getDepartment() {
		return department;
	}
	public int getIt() {
		return it;
	}
	public int getHra() {
		return hra;
	}
	public int getBasic() {
		return basic;
	}
	public String getDesignationcode() {
		return designationcode;
	}
}
class designation{
	String designationcode;
	String designation;
	int da;
	public designation(String designationcode, String designation, int da) {
		super();
		this.designationcode = designationcode;
		this.designation = designation;
		this.da = da;
	}
	public String getDesignation() {
		return designation;
	}
	public String getDesignationCode() {
		return designationcode;
	}
	public int getDa() {
		return da;
	}
	
}

