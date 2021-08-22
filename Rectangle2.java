class Rectangle2{
	int length;
	int width;
	void insert(int l,int w){
		length=l;
		width=w;
	}
	void calculateArea(){System.out.println(length*width);}
	public static void main(String args[]){
		Rectangle2 r1=new Rectangle2(),r2=new Rectangle2();  //creating two objects on one type
		r1.insert(2,4);
		r2.insert(6,4);
		r1.calculateArea();
		r2.calculateArea();
	}
}