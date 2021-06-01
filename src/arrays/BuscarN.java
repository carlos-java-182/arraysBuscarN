package arrays;

import java.util.Scanner;

public class BuscarN {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int a[]= new int[10];
		boolean creciente = true;
		
		do {
			
			for(int i=0; i<10; i++) {
				System.out.print(i+ ".- Digita un número creciente: ");
				a[i]= entrada.nextInt();
				
			}
			
			for(int i =0; i<8; i++) {
				if(a[i]<a[(i+1)]) {
					creciente=true;
				}
				if(a[i]>a[(i+1)]) {
					creciente=false;
					System.out.print("Los números no son crecientes digita otra vez una serie creciente");
					break;
				}
			}
			
		}while(creciente==false);
		
		
		System.out.println("Digita un número para buscarlo: ");
		num = entrada.nextInt();
		
		
		int cont=0;
		
		
		for(int i=0; i<10; i++) {
			if(a[i]==num) {
				cont++;
			}
			
			
			}
		
		
		int b[] = new int [cont];
		int j=0;	
		
		for(int i =0; i <10; i++) {
			if(a[i]==num) {
				b[j] = i;
				j++;
				
				
		}
			
			
			
		}
		
		if(j==0) {
			System.out.println("El número no se encuentra en la serie");
		}
		
	
	for(int i = 0; i<cont;i++)
	{
		System.out.println("El número está en la posición: " + b[i]);
		
		

	}
	
	

}}
