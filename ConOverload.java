//Constructor Overloading in Java

class ConOverload{
	int id;
	String name;
	int age;
	ConOverload(int i,String n){
		id=i;
		name=n;
	}
	ConOverload(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display(){System.out.println(id+" "+name+" "+age);}
	public static void main(String args[]){
		ConOverload s1=new ConOverload(101,"Drakeus");   //Here adding the age value prints the value in output
		
		//ConOverload s1=new ConOverload(101,"Drakeus",18);
		
		ConOverload s2=new ConOverload(102,"Joe",20);
		s1.display();
		s2.display();
	}
}