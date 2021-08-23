//Java copy Constructor

class duplicate{
	int id;
	String name;
	duplicate(int i,String n){
		id=i;
		name=n;
	}
	duplicate(duplicate s){   //method used to copy 
		id=s.id;
		name=s.name;
	}
	void display(){System.out.println(id+" "+name);}
	public static void main(String args[]){
		duplicate s1=new duplicate(101,"Drakeus");
		duplicate s2=new duplicate(s1);
		s1.display();
		s2.display();
	}
}