package Strings_Program;

public class RemoveWhiteSpaceWithoutStringMethod {
public static void main(String[] args) {
	String s="geeks for geeks";
	char[] cha1=s.toCharArray();
	String s1="";
	for(int i=0;i<cha1.length;i++) {
		if(cha1[i]!=' ') {
			s1=s1+cha1[i];
		}
	}
	System.out.println("Convert String into Character Array and and use for loop");
	System.out.println(s1);
	System.out.println(" \n For loop with CharAt Method");
	String s2="";
	for(int i=0; i<cha1.length;i++) {
		if(cha1[i]!=' ') {
			s2=s2+s.charAt(i);
			
		}
	}
	System.out.println(s2);
	System.out.println("/n Removing white space using replaceAll Method");
	String s3=s.replaceAll(" ", "");
	System.out.println(s3);
		}
	

}
