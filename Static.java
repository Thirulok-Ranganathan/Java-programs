//Program of changing the common property of all objects(static field)

class Static{
	int rollno;
	String name;
	static String clg="ITS";
	static void change(){
		clg="BSC";
	}
	Static(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){System.out.println(rollno+" "+name+" "+clg);}
	public static void main(String args[]){
		Static.change();
		Static s1=new Static(101,"Drakeus");
		Static s2=new Static(102,"Joe");
		Static s3=new Static(103,"Harry");
		s1.display();
		s2.display();
		s3.display();
	}
}