package crackingCodingInterview;

public class Q1i3 {
	//Write a method to replace all spaces in a string with '%20'. 
	//You may assume that the string has sufficient space at the end to hold the additional characters, 
	//and that you are given the 'true' length of string. p.90, p.194
	
	private static char[] convert(char[] str, int size){
		int countSpace=0;
		for (int i=0; i<=size; i++)
			if(str[i]==' ') 
				countSpace++;
		
		int cursor=size+countSpace*2; //int cursor=size-countSpace+countSpace*3; //str minus two spaces and plus two places for '%20' 
		
		str[cursor]='\0';
		for(int i=size-1; i>=0; i--)
			if(str[i]==' '){
				str[--cursor] = '0';
				str[--cursor] = '2';
				str[--cursor] = '%';
			} else {
				str[--cursor] = str[i];
			}

		return str;	
	}
	
	public static void main(String[] args){
		//strings in Java are immutable objects 
		char[] str= new char[2048];
		str[0]='M';
		str[1]='r';
		str[2]=' ';
		str[3]='J';
		str[4]='o';
		str[5]='h';
		str[6]='n';
		str[7]=' ';
		str[8]='S';
		str[9]='m';
		str[10]='i';
		str[11]='t';
		str[12]='h';

		int size = 13;

		System.out.format("%s ==> %s\n", new String(str), new String(convert(str, size)));
		
	}
	
}
