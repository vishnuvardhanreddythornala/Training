package module19.CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

//	Write a program to count the number of unique characters in a given string using Set.

public class CountUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Programming";
		Set<Character> uniqueChars = new HashSet<>();
		
		for(char ch: str.toCharArray()) {
			uniqueChars.add(ch);
			
		}
		System.out.println("Unique characters Count: "+uniqueChars.size());
		System.out.println("Unique Characters: "+uniqueChars);
		

	}

}
/*
 * Read the input string

Take a String value.

Create a Set

Use Set<Character> to store characters.

Set is used because it does not allow duplicates.

Convert string to character array

Use toCharArray() to get each character from the string.

Iterate through each character

Use a for-each loop to access characters one by one.

Add characters to the Set

Duplicate characters will be ignored automatically.

Get the count of unique characters

Use set.size() to get the number of unique characters.

Print the result

Display the count (and optionally the unique characters).
 */
