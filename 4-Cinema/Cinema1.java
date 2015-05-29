
public class Cinema1 {

	public static void main(String[] args) {
		int seats[][]={
				      {1,1,1,0,0},
				      {1,0,1,0,1},
				      {0,0,0,0,0},
				      {1,1,1,1,1}
		              };
			freeseats(seats);
		}

	public static void freeseats(int seats[][]){
		int colums=seats[0].length;
		int rows=seats.length;
		int seatsFree=1;
		for(int k=0;k<colums;k++){
		for(int i=0;i<rows;i++){
			int br=0;
			for(int j=0;j<colums;j++){
				if(seats[i][j]==0){
					br++;            //number of free seats by row
					}
				}
			if(br==seatsFree){
				for(int m=0;m<colums;m++){
					if(seats[i][m]==0)
				System.out.printf("(%s,%s)",i+1,m+1);
				
				}
			}
		}
		seatsFree++;                
		}
	}

	
	
}
