package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> listaDesideri = new ArrayList<String>();
		String userChoiche;
		Scanner data = new Scanner(System.in);
		
		
			System.out.println("inserisci un nuovo desiderio");
			userChoiche = data.nextLine();
			listaDesideri.add(userChoiche);
			int lunghezzaLista=0;
			
			while(!userChoiche.equals("")){
				System.out.println("Aggiungi un altro elemento o premi enter per terminare l'operazione");
				userChoiche = data.nextLine();
				listaDesideri.add(userChoiche);
				if(userChoiche.equals("")) {
					System.out.println("Hai deciso di terminare");
				}
			}
				
			System.out.println("La tua lista è composta da:");
			for(int i=0; i < listaDesideri.size()-1; i++) {
				lunghezzaLista = listaDesideri.size()-1;
			}
			System.out.println(lunghezzaLista + " " + "elementi");
			
			String[] arrayList = new String[ listaDesideri.size()];
			listaDesideri.toArray(arrayList);
			
			for(int i = 0; i < arrayList.length;i++) {
				if(!arrayList[i].equals(""))
				System.out.println("il tuo desiderio" + " " + arrayList[i] + " " + "si trova in posizione" + i);
			}
			
	
	}

}
