package com.sgtesting.noargsconstructor;
class Country
{
	int CountryNo;
	String ContinentName;
	String CountryName;
	String CountryLanguage;
	Country()
	{
		CountryNo=07;
		ContinentName="Asia";
		CountryName="India";
		CountryLanguage="English";
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
	State()
	{
		StateNo=22;
		StateName="Karnataka";
		StateCapital="Bangalore";
		StateLanguage="Kannada";
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
	District()
	{
		DisCode=27;
		DisName="Dakshina Kannada";
		DisStateName="Karnataka";
		DisLanguage="Tulu";
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
	Taluk()
	{
		TqCode=15;
		TqName="Sullia";
		TqDisName="D.K";
		TqStateName="Karnataka";
		System.out.println("TqCode "+TqCode);
		System.out.println("TqName "+TqName);
		System.out.println("TqDisName "+TqDisName);
		System.out.println("TqStateName "+TqStateName);
		System.out.println("***************************************************");
	}
}
public class MainDemo2 {

	public static void main(String[] args) {
		Country Obj1=new Country();

		State Obj2=new State();

		District Obj3=new District();

		Taluk Obj4=new Taluk();

	}

}


