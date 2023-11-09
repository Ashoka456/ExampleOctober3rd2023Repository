package com.sgtesting.oopsassignment;
class Country
{
	int CountryNo;
	String ContinentName;
	String CountryName;
	String CountryLanguage;
}
class State
{
	int StateNo;
	String StateName;
	String StateCapital;
	String StateLanguage;
}
class District
{
	int DisCode;
	String DisName;
	String DisStateName;
	String DisLanguage;
}
class Taluk
{
	int TqCode;
	String TqName;
	String TqDisName;
	String TqStateName;
}




public class CountryStateDistrictTaluk {

	public static void main(String[] args) {
		Country Obj1=new Country();
		Obj1.CountryNo=07;
		Obj1.ContinentName="Asia";
		Obj1.CountryName="India";
		Obj1.CountryLanguage="English";
		System.out.println("CountryNo "+Obj1.CountryNo);
		System.out.println("ContinentName "+Obj1.ContinentName);
		System.out.println("CountryName "+Obj1.CountryName);
		System.out.println("CountryLanguage "+Obj1.CountryLanguage);
		System.out.println("********************************************");
		State Obj2=new State();
		Obj2.StateNo=22;
		Obj2.StateName="Karnataka";
		Obj2.StateCapital="Bangalore";
		Obj2.StateLanguage="Kannada";
		System.out.println("StateNo "+Obj2.StateNo);
		System.out.println("SateName "+Obj2.StateName);
		System.out.println("StateCapital "+Obj2.StateCapital);
		System.out.println("StateLanguage "+Obj2.StateLanguage);
		System.out.println("********************************************");
		District Obj3=new District();
		Obj3.DisCode=27;
		Obj3.DisName="Dakshina Kannada";
		Obj3.DisStateName="Karnataka";
		Obj3.DisLanguage="Tulu";
		System.out.println("DisCode "+Obj3.DisCode);
		System.out.println("DisName "+Obj3.DisName);
		System.out.println("DisStateName "+Obj3.DisStateName);
		System.out.println("DisLanguage "+Obj3.DisLanguage);
		System.out.println("************************************************");
		Taluk Obj4=new Taluk();
		Obj4.TqCode=15;
		Obj4.TqName="Sullia";
		Obj4.TqDisName="D.K";
		Obj4.TqStateName="Karnataka";
		System.out.println("TqCode "+Obj4.TqCode);
		System.out.println("TqName "+Obj4.TqName);
		System.out.println("TqDisName "+Obj4.TqDisName);
		System.out.println("TqStateName "+Obj4.TqStateName);
		System.out.println("***************************************************");
	}

}
