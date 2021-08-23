//Purpose of default constructor

class Constructor2{
	int id;
	String name;
	
	void display(){System.out.println(id+" "+name);}
	
	public static void main(String args[]){
		
		Constructor2 s1 = new Constructor2();
		Constructor2 s2 = new Constructor2();
		s1.display();
		s2.display();
	}
}