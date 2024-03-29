package linkedList;

import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {

	private static final Pattern vegetables = Pattern.compile("Zucchini|Paprikas?|Zwiebeln?|Tomaten?");
	
	
	public static void inserCheeseAroundVegetable(List<String> ingredients) {
		//Initialisiert Laufvariable (iterator)
		//Abbruchbedingung (hasNext())
		//keine Inkrementierung -> passiert im Schleifenkörper
		for(ListIterator<String> iterator = ingredients.listIterator(); iterator.hasNext();) {
			String ingredient = iterator.next();
		}
	}
	
	
	public static void main(String[] args) {
		
	}
}
