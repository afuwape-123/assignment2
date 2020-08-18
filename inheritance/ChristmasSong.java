package inheritance;
import java.util.Scanner;
public class ChristmasSong {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("the twelve days christmas song:  ");
		String song = input.next();
		
		while(true) {
		
		switch(song.toUpperCase()) {
		case "A":
			 System.out.println("On the first day of Christmas\r\n"
			 		+ " My true love gave to me\r\n"
			 		+ "A partridge in a pear tree");
			 System.out.println();
			 break;
			 
		case "B":
			System.out.println("On the second day of Christmas\r\n" + 
					"My true love gave to me\r\n" + 
					"Two turtle doves\r\n" + 
					"And a partridge in a pear tree");
			break;
			
		case "C":
			System.out.println("On the third day of Christmas\r\n" + 
					"My true love gave to me\r\n" + 
					"Three French hens\r\n" + 
					"Two turtle doves\r\n" + 
					"And a partridge in a pear tree");
			break;
			
		case "D":
			System.out.println("On the fourth day of Christmas\r\n" + 
					"My true love gave to me\r\n" + 
					"Four calling birds\r\n" + 
					"Three French hens\r\n" + 
					"Two turtle doves\r\n" + 
					"And a partridge in a pear tree");
			break;
			
		case "E":
			System.out.println("On the fifth day of Christmas\r\n" + 
					"My true love gave to me\r\n" + 
					"Five gold rings\r\n" + 
					"Four calling birds\r\n" + 
					"Three French hens\r\n" + 
					"Two turtle doves\r\n" + 
					"And a partridge in a pear tree");
			break;
			
		case "F":
			System.out.println("On the sixth day of Christmas\r\n" + 
					"My true love gave to me\r\n" + 
					"Six geese a laying\r\n" + 
					"Five gold rings\r\n" + 
					"Four calling birds\r\n" + 
					"Three French hens\r\n" + 
					"Two turtle doves\r\n" + 
					"And a partridge in a pear tree");
			break;
			
		case "G":
			System.out.println("On the seventh day of Christmas my true love sent to me\r\n" + 
					"Seven swans a-swimming\r\n" + 
					"Six geese a-laying\r\n" + 
					"Five golden rings\r\n" + 
					"Four calling birds\r\n" + 
					"Three french hens\r\n" + 
					"Two turtle doves, and\r\n" + 
					"A partridge in a pear tree");
			break;
			
		case "H":
			System.out.println("On the eighth day of Christmas my true love sent to me\r\n" + 
					"Eight maids a-milking\r\n" + 
					"Seven swans a-swimming\r\n" + 
					"Six geese a-laying\r\n" + 
					"Five golden rings\r\n" + 
					"Four calling birds\r\n" + 
					"Three french hens\r\n" + 
					"Two turtle doves, and\r\n" + 
					"A partridge in a pear tree");
			break;
			
		case "I":
			System.out.println("\r\n" + 
					"On the ninth day of Christmas my true love sent to me\r\n" + 
					"Nine ladies dancing\r\n" + 
					"Eight maids a-milking\r\n" + 
					"Seven swans a-swimming\r\n" + 
					"Six geese a-laying\r\n" + 
					"Five golden rings\r\n" + 
					"Four calling birds\r\n" + 
					"Three french hens\r\n" + 
					"Two turtle doves, and\r\n" + 
					"A partridge in a pear tree");
			break;
			
		case "J":
			System.out.println("\r\n" + 
					"On the 10th day of Christmas my true love sent to me\r\n" + 
					"10 lords a-leaping\r\n" + 
					"Nine ladies dancing\r\n" + 
					"Eight maids a-milking\r\n" + 
					"Seven swans a-swimming\r\n" + 
					"Six geese a-laying\r\n" + 
					"Five golden rings\r\n" + 
					"Four calling birds\r\n" + 
					"Three french hens\r\n" + 
					"Two turtle doves, and\r\n" + 
					"A partridge in a pear tree");
			break;
			
		case "K":
			System.out.println("\r\n" + 
					"On the 11th day of Christmas my true love sent to me\r\n" + 
					"11 pipers piping\r\n" + 
					"10 lords a-leaping\r\n" + 
					"Nine ladies dancing\r\n" + 
					"Eight maids a-milking\r\n" + 
					"Seven swans a-swimming\r\n" + 
					"Six geese a-laying\r\n" + 
					"Five golden rings\r\n" + 
					"Four calling birds\r\n" + 
					"Three french hens\r\n" + 
					"Two turtle doves, and\r\n" + 
					"A partridge in a pear tree");
			break;
			
		case "L":
			System.out.println("\r\n" + 
					"On the 12th day of Christmas my true love sent to me\r\n" + 
					"12 drummers drumming\r\n" + 
					"11 pipers piping\r\n" + 
					"10 lords a-leaping\r\n" + 
					"Nine ladies dancing\r\n" + 
					"Eight maids a-milking\r\n" + 
					"Seven swans a-swimming\r\n" + 
					"Six geese a-laying\r\n" + 
					"Five golden rings\r\n" + 
					"Four calling birds\r\n" + 
					"Three french hens\r\n" + 
					"Two turtle doves, and\r\n" + 
					"A partridge in a pear tree");
			break;
			default:
				break;
				
				
		}

		System.out.println("the twelve days of christmas song: ");
		song = input.next();
					if(song.equalsIgnoreCase("O"))
				break;
		}
	}
}
