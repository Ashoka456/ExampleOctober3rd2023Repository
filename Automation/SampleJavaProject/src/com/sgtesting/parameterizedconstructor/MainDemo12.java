package com.sgtesting.parameterizedconstructor;
class Country
{
	int CountryNo;
	String ContinentName;
	String CountryName;
	String CountryLanguage;
	Country(int cno,String conn,String cn,String cl)
	{
		CountryNo=cno;
		ContinentName=conn;
		CountryName=cn;
		CountryLanguage=cl;
		System.out.println("CountryNo "+CountryNo);
		System.out.println("ContinentName "+ContinentName);
		System.out.println("CountryName "+CountryName);
		System.out.println("CountryLanguage "+CountryLanguage);
		System.out.println("********************************************");
	}
}
class State
{
	int StateNo;
	String StateName;
	String StateCapital;
	String StateLanguage;
	State(int sno,String sname,String scap,String sl)
	{
		StateNo=sno;
		StateName=sname;
		StateCapital=scap;
		StateLanguage=sl;
		System.out.println("StateNo "+StateNo);
		System.out.println("SateName "+StateName);
		System.out.println("StateCapital "+StateCapital);
		System.out.println("StateLanguage "+StateLanguage);
		System.out.println("********************************************");
	}

}
class District
{
	int DisCode;
	String DisName;
	String DisStateName;
	String DisLanguage;
	District(int dcode,String dname,String dsname,String dl)
	{
		DisCode=dcode;
		DisName=dname;
		DisStateName=dsname;
		DisLanguage=dl;
		System.out.println("DisCode "+DisCode);
		System.out.println("DisName "+DisName);
		System.out.println("DisStateName "+DisStateName);
		System.out.println("DisLanguage "+DisLanguage);
		System.out.println("************************************************");
	}
}
class Taluk
{
	int TqCode;
	String TqName;
	String TqDisName;
	String TqStateName;
	Taluk(int tqc,String tname,String tdname,String tsname)
	{
		TqCode=tqc;
		TqName=tname;
		TqDisName=tdname;
		TqStateName=tsname;
		System.out.println("TqCode "+TqCode);
		System.out.println("TqName "+TqName);
		System.out.println("TqDisName "+TqDisName);
		System.out.println("TqStateName "+TqStateName);
		System.out.println("***************************************************");
	}
}
public class MainDemo12 {

	public static void main(String[] args) {
		Country Obj1=new Country(07,"Asia","India","English");

		State Obj2=new State(22,"Karnataka","Bangalore","Kannada");

		District Obj3=new District(27,"Dakshina Kannada","Karnataka","Tulu");

		Taluk Obj4=new Taluk(15,"Sullia","D.K","Karnataka");

	}

}




