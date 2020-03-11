package teste;

import org.junit.Test;

public class Criptografia {

public static int  retornarNUmeroColuna(String texto, int numeroFatias) {
	int numColunas = texto.length()/numeroFatias;
	 if((texto.length()%numeroFatias) > 0) {
		numColunas++;   
	 }
	
 return numColunas; 	
}


public static String codificar(String texto, int numerosFatias) {
	
	 char matriz [][];
	 String resultado = "";
	
	 matriz = new char[numerosFatias][retornarNUmeroColuna(texto, numerosFatias)];
	 for(int i = 0; i < texto.length(); i++) {
		 matriz[i&numerosFatias][i/numerosFatias] = texto.charAt(i);
		 System.out.println(texto.charAt(i));
	 }
     	 for (int i = 0; i < matriz.length; i++) {
		   for (int j = 0; j < matriz[i].length; j++) {
			  resultado += matriz[i][j]; 
		   }
		 
	 }
 return resultado;	
}

public static void main(String[]  args) {

	System.out.println(codificar("Criptografia", 12)); 
	
}


}
