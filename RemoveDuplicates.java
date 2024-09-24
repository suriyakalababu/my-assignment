package week6Day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We are learn java basics as part of java session  in java week1";
		int count = 0;
		String [] split = text.split(" ");
		count = 0;
		for (int i = 1; i<split.length;i++) {
			count = 0;
			for ( int j = i+1;j<split.length;j++) {
				count ++;
				
			}
			if(count > 0) {
				split[i]="";
				
			}
			
		}
		for(int i = 0;i<split.length;i++) {
			if(split[i]!="") {
				System.out.println(split[i]+"");
			}
		}
	}
}