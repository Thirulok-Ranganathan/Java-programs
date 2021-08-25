// Understanding the problem without this keyword

class Keyword{
	int id;
	String name;
	Keyword(int id,String name){	
		id=id;			//Notice! Keyword is not used here
		name=name;
	}
	void display(){System.out.println(id+" "+name);}
	public static void main(String args[]){
		Keyword s1=new Keyword(101,"Drakeus");
		Keyword s2=new Keyword(102,"Joe");
		s1.display();
		s2.display();
	}
}