
public class ObjectFactory {

	public static void main(String[] args) {
		
		Pen firstPen = new Pen();
		firstPen.color="Kırmızı";
		firstPen.height=10;
		String message="ilk kaleminiz üretildi.";
		firstPen.writeMessage(message);
		Pen secondPen = new Pen();
		secondPen.color= " Mavi " ;
		secondPen.height= 23 ;
		secondPen.writeMessage(secondPen.color + ""+secondPen.height);
		
		

	}

}
