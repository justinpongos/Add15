
public class Add15 {
    public static void main(String args[]) {
        int [][] grid = new int [3][5];
        
        int inclusive =1;
        int sum = 0;
     
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = inclusive++; // 1 to 15
            }//end for 1 
        }//end for 2
        
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + " "); // printing table
                sum += grid[row][col];   // total sum grid
            }//end for 1 
            System.out.print("\n");
        }//end for 2
       
        System.out.println("The total sum of all elements in the array is: " + sum); // printing sum of whole grid
        
        for (int row = 0; row < grid.length; row++) {
          	int totalr = 0;
        	for (int col = 0; col < grid[0].length; col++) {
        		  totalr += grid[row][col]; // sum of each row
            }//end for 1
     
        	System.out.println("The total sum of row " + (row + 1) + " is: " + totalr); // printing total of each row
        }//end for 2
        
        for (int col = 0; col < grid[0].length; col++) {
        	int totalc = 0;
        	for (int row = 0; row < grid.length; row++) {
                totalc += grid[row][col]; // total sum of each col
        		}//end for 1
        			System.out.println("The total sum of col " + (col + 1) + " is: " + totalc); // printing total of each column
        	}//end for 2
       }//end main
   }//end class
