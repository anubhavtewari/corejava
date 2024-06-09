import java.util.Scanner;
public class TesterPoint2D{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Point2D p1 = new Point2D(sc.nextInt(), sc.nextInt());
		Point2D p2 = new Point2D(sc.nextInt(), sc.nextInt());
		System.out.println("1st point"+p1.show());
		System.out.println("1st point"+p2.show());
		System.out.println("Is P1 equal to P2? "+p1.isEqual(p2));
		System.out.println("Is P1 equal to P2? "+p2.isEqual(p1));
		System.out.println("Distance bw two points: "+p2.calculateDistance(p1));
	}
}
	