//Example of Method Overloading by changing data type of argument

class calculation2{
	void sum(int a,int b){System.out.println(a+b);}
	void sum(double a,double b){System.out.println(a+b);}
	public static void main(String args[]){
		calculation2 add=new calculation2();
		add.sum(10,15);
		add.sum(10.5,12.5);
	}
}