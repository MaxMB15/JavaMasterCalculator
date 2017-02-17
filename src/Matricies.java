import java.awt.Point;
import java.util.ArrayList;

public class Matricies {
	static String input = "1	0	0	0	⎤⎦⎥⎥⎥⎥⎥⎥⎥] 0	7 0 4  0 0 1 0   0 6 0 5";
	
	
	public static void main(String[] args){
		System.out.println(findDet());
	}
	static String findDet(){
		String output = "";
		String temp = "";
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		matrix.add(new ArrayList<Integer>());
		//reformat input
		int i = 0;
		char[] arrayT = input.toCharArray();
		while(i<input.length()){
			if(Character.isDigit(arrayT[i])||arrayT[i] == '-'){
				temp+=arrayT[i];
			}
			else if(arrayT[i]=='⎥'){
				break;
			}
			else{
				if(!temp.equals("")){
					matrix.get(0).add(new Integer(Integer.parseInt(temp)));
					temp = "";
				}
			}
			i++;
		}
		//after the first row
		int cols = matrix.get(0).size();
		int rowNum = 1;
		if(!(i>=input.length()-1)){
			matrix.add(new ArrayList<Integer>());							
		}
		while(i<input.length()){
			if(Character.isDigit(arrayT[i])||arrayT[i] == '-'){
				temp+=arrayT[i];
				if(i==input.length()-1){
					matrix.get(rowNum).add(new Integer(Integer.parseInt(temp)));
					temp = "";
				}
			}
			else{
				if(!temp.equals("")){
					matrix.get(rowNum).add(new Integer(Integer.parseInt(temp)));
					temp = "";
					if(matrix.get(rowNum).size()>=cols){
						rowNum++;
						matrix.add(new ArrayList<Integer>());
					}
				}
			}
			i++;
		}
		
		
		
		
		//determinate logic
		printMatrix(matrix);
		System.out.println();
		System.out.println(detLogic(matrix));
		return "";
	}
	static int detLogic(ArrayList<ArrayList<Integer>> matrix){
		int output = 0;
		int addsub = 1;
		if(matrix.size()==1){
			return matrix.get(0).get(0);
		}
		for(int i = 0;i<matrix.get(0).size();i++){
			output += addsub*matrix.get(0).get(i)*detLogic(remRC(matrix,new Point(i,0)));
			addsub*=-1;
		}
		return output;
	}
	static ArrayList<ArrayList<Integer>> remRC(ArrayList<ArrayList<Integer>> matrix,Point p){
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		int offset = 0;
		for(int y = 0; y<matrix.size();y++){
			
			if(y==p.y){
				offset++;
			}
			else{
				output.add(new ArrayList<Integer>());
				for(int x = 0; x<matrix.get(0).size();x++){
					if(x!=p.x){
						output.get(y-offset).add(matrix.get(y).get(x));
					}
				}
			}
		}
		return output;
	}
	static void printMatrix(ArrayList<ArrayList<Integer>> matrix){
		//Print matrix
		for(int y = 0;y<matrix.size();y++){
			for(int x = 0;x<matrix.get(0).size();x++){
				System.out.print(matrix.get(y).get(x)+" ");
			}
			System.out.println();
		}
	}
}
