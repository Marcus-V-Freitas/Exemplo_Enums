package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Shape;
import Entities.Enum.Circle;
import Entities.Enum.Color;
import Entities.Enum.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Shape> shapes=new ArrayList<>();
		
		System.out.println("Digite o número de formas: ");
		int n=sc.nextInt();
		
		for(int i=0; i<n;i++) {
			System.out.printf("Shape"+ i +"data\n");
			System.out.println("Rectangle or Circle(r/c)?");
			char answer=sc.next().toLowerCase().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED)");
			Color color=Color.valueOf(sc.next().toUpperCase());
			if(answer=='r') {
					System.out.println("Width: ");
					Double width=sc.nextDouble();
					System.out.println("Height: ");
					Double height=sc.nextDouble();
					shapes.add(new Rectangle(color, width, height));
			}else {
						System.out.println("Raidius: ");
					Double radius=sc.nextDouble();
					shapes.add(new Circle(color,radius));
			}
			
		}
		
		System.out.println("SHAPES AREAS");
		
		for(Shape shape: shapes) {
			System.out.println(shape);
		}
sc.close();
	}

}
