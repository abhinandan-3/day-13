package day13;

public class IpAddress {
	public static void main(String[] args) {
		String input = "172.16.254.1";
		//input = input.replace('.', ' ');
		//String[] data = input.split(" ");
		String[] data=getArrayele(input);                                                                      
		int num =0;
		boolean isValid = false;
		if(data.length ==4) 
		 {
			for(int i=0;i<data.length;i++) {
				//System.out.print(data[i]+" ");
				num = Integer.parseInt(data[i]);
				if( (num <0) ||(num > 255)) {
					isValid = true;
				}
				else {
					isValid=false;
					break;
				}
				}
			}
		if(isValid == true) {
			System.out.println("Valid IPv4 Address");
		}else {
				System.out.println("Not a Valid IPv4 Address");
		}
	}

	private static String[] getArrayele(String input) {
		char[] chars=input.toCharArray();
		String word="";
		String[] splWords =new String[30];
		int index=0;
		for(int i=0;i<chars.length;i++) {
			if(chars[i]=='.') {
				splWords[index++]=word;
			}
			else {
				word=word+chars[i];
			}
		}
		if
			}
		}
		
		
		return null;
	}
}

