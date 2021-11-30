package Assignment2Part2;
import java.util.*;

public class SortByOccurences implements Comparator<hashtagObj>  {
	public int compare(hashtagObj a, hashtagObj b) {
		return b.occurences - a.occurences;
	}

}
