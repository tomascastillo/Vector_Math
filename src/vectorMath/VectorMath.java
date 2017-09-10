package vectorMath;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VectorMath {
	
	
	private double [] vec;
	
	
	
	public VectorMath(String path) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File(path));
		vec = new double[sc.nextInt()];
		sc.close();
	}
	
	public VectorMath(int dim) {
		vec = new double[dim];	
	}

	public VectorMath Sumar(VectorMath vec1) throws DistDimException
	{
		VectorMath vec2 = new VectorMath(vec.length);
		if(this.vec.length!=vec1.vec.length){
			throw new DistDimException(" Distinta Dimension ");
		}
		for (int i = 0; i < vec.length; i++) {
			vec2.vec[i] = vec[i] + vec1.vec[i];
		}
		
		return vec2;
	}

	public double Producto(VectorMath vec1)
	{
		double result=0;
		for (int i=0;i<this.vec.length;i++){
			result+=this.vec[i]*vec1.vec[i];
		}
		return result;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	}
	public double Modulo(){
		double aux=0;
		for (int i = 0; i < vec.length; i++) {
			aux+=Math.pow(vec[i],2);
		}
		Math.sqrt(aux);
		return aux;
	}
	
	
}
