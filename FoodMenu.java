import java.util.Scanner;
public class FoodMenu{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Food menu:\n 1.Dosa 2. Upma 3. Idli 4. m11 5. sed 6. fsdsdf 7. gg 8.es 9. ew 10. Generate Bill");
		int totalCost = 0, cost = 0;
		boolean condition = true;
		while(condition){
			if(sc.hasNextInt()){
			int num = sc.nextInt();
			switch(num){
				case 1: totalCost = totalCost+80; break;
				case 2: totalCost = totalCost+40; break;
				case 3: totalCost = totalCost+30; break;
				case 4: totalCost = totalCost+100; break;
				case 5: totalCost = totalCost+70; break;
				case 6: totalCost = totalCost+60; break;
				case 7: totalCost = totalCost+120; break;
				case 8: totalCost = totalCost+125; break;
				case 9: totalCost = totalCost+20; break;
				case 10: System.out.println("Total bill: "+totalCost); condition = false; break;
				default: System.out.println("Wrong input!");
				}
			}
			else{
				System.out.println("Integer toh daaloo!!!");
				break;
			}
		}
	}
}