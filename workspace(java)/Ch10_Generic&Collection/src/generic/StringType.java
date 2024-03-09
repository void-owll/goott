package generic;

public class StringType {
	String[] str;
	
	String var;
	
	void setArr(String[] str) {
		this.str = str;
	}
	
	void setVar(String var) {
		this.var = var;
	}
	
	void output() {
		for(String s : str) {
			System.out.println("str 배열 요소 >> " + s);
		}
		System.out.println("var >> " + var);
	}
}
