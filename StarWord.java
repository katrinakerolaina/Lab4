package Lab4;

public class StarWord {
	
	//declare data members
	private String word;
	private StringBuffer starWord;
	
	//constructor
	public StarWord() {
		word = new String();
		starWord = new StringBuffer();
		
	}
	
	//setMethod
	public void setWord(String word) {
		this.word = word;	
	}
	 	
	//computeVowels method 1
	public void compVowels() {
		
		starWord = new StringBuffer();
	
	for(int i = 0; i < word.length(); i++) {
		
		if(word.charAt(i) == 'e') {	
			starWord.append('2');
			
		}else if
			(word.charAt(i) == 'i'){
				starWord.append('3');
				
			}else if
					(word.charAt(i) == 'o') {
					starWord.append('4');
			}else if
					(word.charAt(i) == 'u') {
					starWord.append('5');
			}else if
					(word.charAt(i) == 'a') {
					starWord.append('1');
			}else {
					
			starWord.append(word.charAt(i));
		}		
	}//end for
	
	
	}//end method 1

	
	//computeStars method 2
	public void compStars() {
		starWord = new StringBuffer();
		for(int i = 0; i < word.length(); i ++) {
			starWord.append('*');

		}//end for

	}//end method 2
	
	 
	//computePigLatin method 3
		public void compPig() {
			starWord = new StringBuffer();
			for(int i = 1; i<word.length(); i++) {
				starWord.append(word.charAt(i));
				//erek
			}
		starWord.append(word.charAt(0));
		//erekD
		starWord.append('a');
		//erekDa
		starWord.append('y');
		
		}//end method 3
	
	//reverseWord method 4
		public void compReverse() {
			starWord = new StringBuffer();
			for(int i= word.length()-1; i>=0; i--) {
				starWord.append(word.charAt(i));
			}
		}//end method 4
		
	
	//get method
			public String getStarWord() {
				return starWord.toString();

			}

}//end class