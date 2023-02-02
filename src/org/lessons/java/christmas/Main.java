package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		creo la lista
		ArrayList<String> listaDesideri = new ArrayList<String>();
//		creo una variabile che rappresenta la scelta fatta dall'utente
		String userChoiche;
//		utilizzo la classe Scanner per leggere i dati dlel'utente
		Scanner data = new Scanner(System.in);
		
		
		System.out.println("inserisci un nuovo desiderio");
		userChoiche = data.nextLine();
		listaDesideri.add(userChoiche);
		int lunghezzaLista=0;
			
		while(!userChoiche.equals("")){
		System.out.println("Aggiungi un altro elemento o premi enter per terminare l'operazione");
		userChoiche = data.nextLine();
		if(!userChoiche.equals("")) {
			listaDesideri.add(userChoiche);
		}
		else if(userChoiche.equals("")) {
			System.out.println("Hai deciso di terminare");
			data.close();
			}
		}
			
		System.out.print("La tua lista è composta da:");
		for(int i=0; i < listaDesideri.size()-1; i++) {
			lunghezzaLista = listaDesideri.size()-1;
		}
		System.out.println(lunghezzaLista + " " + "elementi");
			
//		Ordinare in ordine alfabetico
		Collections.sort(listaDesideri, Comparator.naturalOrder());
		System.out.println(listaDesideri);
			
		String[] arrayList = new String[ listaDesideri.size()];
		listaDesideri.toArray(arrayList);
			
		for(int i = 0; i < arrayList.length;i++) {
			if(!arrayList[i].equals(""))
					
			System.out.println("il tuo desiderio" + " " + arrayList[i] + " " + "si trova in posizione" + i);
		}
	}

}
