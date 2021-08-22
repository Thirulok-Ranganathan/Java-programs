//Maintains the records of students
class students{
	int rollno;
	String name;
	void insertRecord(int r,String n){
		rollno=r;
		name=n;
	}
	void displayInformation(){System.out.println(rollno+" "+name);}
	public static void main(String args[]){
		students s1=new students();
		students s2=new students();
		s1.insertRecord(101,"Drakeus");
		s2.insertRecord(102,"Joe");
		s1.displayInformation();
		s2.displayInformation();
	}
}