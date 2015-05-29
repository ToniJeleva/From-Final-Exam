
public class second {

	public static void main(String[] args) {
		int numbers[]={100,100,90};
		secondLargest(numbers);

	}
	
	public static void secondLargest(int numbers[]){
		int largest=0;
		int secondLargest=0;
		if(numbers.length<2){
				System.out.print("False");
		}
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>=largest){
				largest=numbers[i];
			}else if(numbers[i]>secondLargest){
					secondLargest=numbers[i];
			}
		}
		if(secondLargest==0){
			System.out.print("False");
		}else{
			System.out.print(secondLargest);
		}
	}

}
