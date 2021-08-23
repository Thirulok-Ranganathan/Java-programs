//Java parameterized constructor

class Constructor3{
	int id;
	String name;
	Constructor3(int i,String n){
		id=i;
		name=n;
	}
	void display(){System.out.println(id+" "+name);}
	
	public static void main(String args[]){
		Constructor3 s1=new Constructor3(101,"Drakeus");
		Constructor3 s2=new Constructor3(102,"Joe");
		s1.display();
		s2.display();
	}
}