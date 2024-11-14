

interface Shape
{
	public int calculateArea();
}

class Square implements Shape
{
	public int side;

	public Square(int side){
		this.side=side;
	}

	public int calculateArea()
	{
		System.out.println("inside calculateShape()");
		return this.side * this.side;
	}
}

class Rectangle implements Shape
{
	public int length;
	public int breadth;

	public Rectangle(){

	}

	public int calculateArea()
	{
		return this.length * this.breadth;
	}
}


class Program102
{
	public static void main(String[] args) {
		
			Shape shape=new Square(12);
			int result=shape.calculateArea();

			System.out.println("Area is :"+result);
			

	}
}