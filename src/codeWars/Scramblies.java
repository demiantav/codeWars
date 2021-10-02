package codeWars;

public class Scramblies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="eratndmeiopamnei";
		String nombre2="demian";
		
		System.out.println(Scramblies.Scramblies(nombre, nombre2));

	}
	
	public static boolean Scramblies(String str, String str2) {
		
		char arr1[]=str.toCharArray();
		char arr2[]=str2.toCharArray();
		
		int pos=0;
		char aux;
		int count=0;
		
		for(char s2: arr2) {
			
			pos=0;
			
			for(char s1:arr1) {
				
				if(s2==s1) {
					
					count++;
					
					for(int i= pos;i<arr1.length-1;i++) {
						
						
						arr1[i]=arr1[i+1];
						
						
					}
					break;
					
				     
					
					
				}
				
				pos++;
				

			      
			}
			
		}
		
		return count==arr2.length;
		
	}
}