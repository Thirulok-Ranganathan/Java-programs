// Solution of previous problem with this keyword

class Keyword2{
	int id;
	String name;
	Keyword2(int id,String name){
		this.id=id;		//this keyword is used in this method
		this.name=name;
	}
	void display(){System.out.println(id+" "+name);}
	public static void main(String args[]){
		Keyword2 s1=new Keyword2(101,"Drakeus");
		Keyword2 s2=new Keyword2(102,"Joe");
		s1.display();
		s2.display();
	}
}