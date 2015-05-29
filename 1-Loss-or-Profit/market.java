
public class market {

	public static void main(String[] args) {
		int income[]={10};
		int outcome[]={20,30};
		System.out.print(loss_or_profit(income,outcome));

	}
	
	public static int loss_or_profit(int income[],int outcome[]){
		int sumOfIncome=0;
		int sumOfOutcome=0;
		
		for(int i=0;i<income.length;i++)
			sumOfIncome=sumOfIncome+income[i];
		
		for(int j=0;j<outcome.length;j++)
			sumOfOutcome=sumOfOutcome+outcome[j];
		
		return (sumOfIncome-sumOfOutcome);
	}
	

}
