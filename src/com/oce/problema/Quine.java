package com.oce.problema;

public class Quine {
	public static void main(String[] args) {
		int a=2;
		int b=3;
		char q = 34;
		String[] s= {
			"package com.oce.problema;",
			"",
			"public class Quine {",
			"	public static void main(String[] args) {",
			"		int a=2;",
			"		int b=3;",
			"		char q = 34;",
			"		String[] s= {",
			"	",
			"};",
			"for(int i=0;i<9;i++) System.out.println(s[i]);",
			"for(int i=0;i<s.length;i++) System.out.println(s[8]+q+s[i]+q+\",\");",
			"for(int i=10;i<s.length;i++) System.out.println(s[i]);",
			"}",
			"}",
		};
		for(int i=0;i<8;i++) System.out.println(s[i]);
		for(int i=0;i<s.length;i++) System.out.println(s[8]+q+s[i]+q+",");
		for(int i=9;i<s.length;i++) System.out.println(s[i]);
	}

}
