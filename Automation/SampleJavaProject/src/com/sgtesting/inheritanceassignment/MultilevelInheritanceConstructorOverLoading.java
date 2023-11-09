package com.sgtesting.inheritanceassignment;
class StudentA
{
	StudentA(String fname)
	{
		System.out.println("First Name:"+fname);

	}
	StudentA(int age)
	{
		System.out.println("Age"+age);
		
	}
	StudentA(String address,int rollno)
	{
		System.out.println("Address:"+address);
		System.out.println("Roll No:"+rollno);
		
	}
	
}
class Student1  extends StudentA
{
	String collegename;
	Student1(String fname,String collegename)
	{
		super(fname);
		this.collegename=collegename;
		System.out.println("collegename:"+collegename);
	}
	int idnum;
	Student1(int age,int idnum)
	{
		super(age);
		this.idnum=idnum;
		System.out.println("Idnum:"+idnum);
	}
	String collegeaddress;
	Student1(String address,int rnum,String collegeaddress)
	{
		super(address,rnum);
		this.collegeaddress=collegeaddress;
		System.out.println("collegeaddress:"+collegeaddress);
	}
}
class Student2 extends Student1
{
	String sportname;
	Student2(String fname,String collegename,String sportname)
	{
		super(fname,collegename);
		this.sportname=sportname;
		System.out.println("Sport Name:"+sportname);
	}
	int teamnum;
	Student2(int age,int idnum,int teamnum)
	{
		super(age,idnum);
		this.teamnum=teamnum;
		System.out.println("Teamnum:"+teamnum);
	}
	String sportsgroundname;
	Student2(String address,int rollnum,String collegeaddress,String sportname)
	{
		super(address,rollnum,collegeaddress);
		this.sportsgroundname=sportsgroundname;
		System.out.println("sportsgroundname:"+sportsgroundname);
	}
}
public class MultilevelInheritanceConstructorOverLoading {

	public static void main(String[] args) {
		Student2 O1=new Student2("Abhi","SG","Cricket");
		Student2 O2=new Student2(22,077,142);
		Student2 O3=new Student2("Bangalore",143,"Attiguppe","Chess");	

	}

}
