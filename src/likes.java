

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class likes {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		int f1 =0, f2= 0, f3= 0, f4= 0;
		ArrayList <String> likes = new ArrayList<String>();
		String file = "C:\\Users\\Hikoichi\\eclipse-workspace\\Desafio6\\Like";
		String a = "";
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br  = new BufferedReader(fr);
			while ((a = br.readLine()) != null) {
				System.out.println("holaaa " + a);
				a.split(" ");
				System.out.println("holaaa2 " + a);
				likes.add(a);}
			
			
		 }catch (Exception e) {
			System.out.println("Excepcion leyendo fichero " + a + " : " + e);
		}
		for (int i = 0; i < likes.size(); i++) {
			if( likes.get(i) == "foto1") {
				f1++;
			} else if (likes.get(i) == "foto2") {
				f2++;
			} else if (likes.get(i) == "foto3") {
				f3++;
			} else {
				
			}
		}
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);	
		
	
		System.out.println(likes);
		List<String>fotos = likes.stream().distinct().collect(Collectors.toList());
		System.out.println("hola" + fotos);
		
	
	}
}
	

