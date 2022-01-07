package strings;

public class ValidIP {

	public static boolean checkDots(String IP) {
			String arr[] = IP.split("\\.");
			return (arr.length==4) ? true: false;
	}
	public static boolean checkValidity(String IP) {
		String arr[] = IP.split("\\.");
		boolean check = false;
		for(int i=0;i<arr.length;i++) {
			if(Integer.parseInt(arr[i])>=0 && Integer.parseInt(arr[i])<=255) {
				check = true;
				
			}else {
				check = false;
				break;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		String IP = "222.111.111.222";
		if(checkDots(IP) && checkValidity(IP)) {
			System.out.println("IP address is valid...");
		}else System.out.println("IP address is not valid...");

	}

}
