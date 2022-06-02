package collectionsframework;

import java.util.EnumSet;

public class enumSet {

	//not synchronised
	//highly performance
	//faster than hashset
	//all methods are implemented using bitwise 
	
	enum lang{
		JAVA,PYTHON,CSHARP,RUBY
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EnumSet<lang> eset1 =  EnumSet.allOf(lang.class);
		System.out.println(eset1);
		//empty set
		EnumSet<lang> eset2 =  EnumSet.noneOf(lang.class);
		System.out.println(eset2);
		
		//range(e1,e2)
		EnumSet<lang> eset3 = EnumSet.range(lang.PYTHON, lang.RUBY);
		System.out.println(eset3);
		
		//of
		System.out.println(EnumSet.of(lang.PYTHON,lang.JAVA));
		//we have add/addall/remove/retain etc methods.
		
	}
	
	

}
