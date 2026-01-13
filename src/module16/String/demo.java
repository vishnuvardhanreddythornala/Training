package module16.String;
/*
 * String s = "java is a programming language it is a high level programming language" ;

	java = 1
	is = 2
	a = 2
	programming = 2
	language = 2
	it = 1
	high = 1
	level = 1
 */
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is a programming language it is a high level programming language";
		String[] words = s.split(" ");
		
		boolean counted[] = new boolean[words.length];
		
		for(int i = 0; i<words.length; i++) {
			if(counted[i]) {
				continue;
			}
			int count = 1;
			
			for(int j = i + 1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					counted[j] = true;
				}
			}
			System.out.println(words[i] + " = " + count);
		}
	}

}
