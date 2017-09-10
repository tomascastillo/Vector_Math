package vectorMath;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrizMath {
	
	private double [][] mat;
	
	public MatrizMath(double[][] mat) {
		super();
		this.mat = mat;
	}

	public MatrizMath(String path) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(path));
		mat = new double[sc.nextInt()][sc.nextInt()];
		sc.close();
	}
	
	public MatrizMath(int f,int c) {
		mat = new double[f][c];
	}

	public MatrizMath Producto(MatrizMath mat1){
		int fil_m1 = mat1.mat.length;
		int col_m1 = mat1.mat[0].length;
		 
		int fil_m2 = this.mat.length;
		int col_m2 = this.mat[0].length;
		if (col_m1 != fil_m2)
			  throw new RuntimeException("No se pueden multiplicar las matrices");
		double[][] mat = new double[fil_m1][col_m2];
		MatrizMath multiplicacion = new MatrizMath(mat);
		for (int x=0; x < multiplicacion.mat.length; x++) {
			  for (int y=0; y < multiplicacion.mat[x].length; y++) {
			    for (int z=0; z<col_m1; z++) {
			      multiplicacion.mat [x][y] += this.mat[x][z]*mat1.mat[z][y]; 
			    }
			  }
			}
		return multiplicacion;
	}
	

}
