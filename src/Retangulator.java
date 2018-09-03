public class Rectangulator{
	public static void main(String[] args){
		int length = Integet.parseInt(args[0]);
		int width = Interget.parseInt(args[1]);
		Rectangle myRectangle = new Rectangle( lenght , width );
		String output =String.format("*** your Rectangle *** \n\nLength:%d\nWidth:%d\nArea: %d\nPerimeter: %d\n\n",myRectangle.length,myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());
		System.out.println(output);
	}
}

