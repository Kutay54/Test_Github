package muiscalChairs;

public class MusicalChairsGame {

	public static void main(String[] args) {
		
		MusicalChairs mc1 = new MusicalChairs("Lisa", "Susi", "Tom", "James");
		System.out.println(mc1);
		
		
		MusicalChairs mc2 = new MusicalChairs("Madeleine", "Benedikt");
		System.out.println(mc2);
		
		//MusicalChairs mc3 = new MusicalChairs();
		//System.out.println(mc3);
		
		mc1.rotate(2);
		System.out.println(mc1);
		
		mc1.rotateAndRemoveLast(2);
		System.out.println(mc1);
		mc1.play(2);
		System.out.println(mc1);
	}

}
