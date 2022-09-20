import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello Java");
		
		//ornek1
		
		int ogrenciSayisi = 11;
		String mesaj = "Öğrenci sayısı:";
		
		System.out.println(mesaj + ogrenciSayisi);
		
		//ornek2
		
		int sayi =24;
		if (sayi<20) {
			System.out.println("Sayı 20'den küçüktür.");
		}
	    else if (sayi==20) {
				System.out.println("Sayı 20'ye eşittir.");
			}	
			
	    else {
			System.out.println("Sayı 20'den büyüktür.");	}
		
		//recapDemo1
		
		int sayi1 = 266;
		int sayi2 = 25;
		int sayi3 = 26;
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2); {
			enBuyuk = sayi2;
		}
		
		if (enBuyuk<sayi3); {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük="+enBuyuk);	
		
	
		//switchDemo
		
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef kaldınız");
			break;
		default:
				System.out.println("Geçersiz not girdiniz");
		}
		
		//loopDemo
		//for
		
		for (int i=1;i<10;i+=2){
			System.out.println(i);
		}
			
			
		System.out.println("For Döngüsü bitti");
		
		
			
		//whileDöngüsü
		
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While döngüsü bitti");
		
		
		//do-while
		
		int j=1;
		do {
			System.out.println(j);
			j+=2;
			
		}while(j<10);
		
		System.out.println("D0-While döngüsü bitti");
		
		
		//arraysDemoDiziler []
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("---------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		for(int x=0;x<ogrenciler.length;x++) {
			System.out.println(ogrenciler[x]);
	    }
		
		System.out.println("---------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		//recapDemo2
		
		double[] myList = {1.2,6.3,4.3,5.6};
		double total=0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
			
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);
		
		//multiDimensionalArrayDemo
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0]="İstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbakır";
		sehirler[2][1]="Şanlıurfa";
		sehirler[2][2]="Gaziantep";
		
		for(int y = 0; y<=2;y++) {
			System.out.println("--------------");
			for(int a=0;a<=2;a++)
				System.out.println(sehirler[y][a]);
			
		}
		
		System.out.println("--------------");
		
		//stringsDemo
		
		String mesaj1 = "Bugün hava çok güzel.";				
		System.out.println(mesaj1);
		
		
		System.out.println("Eleman sayısı : "+mesaj1.length());
		System.out.println("5. eleman : "+mesaj1.charAt(4));		
		System.out.println(mesaj1.concat(" Yaşasın!"));
		System.out.println(mesaj1.startsWith("B"));
		System.out.println(mesaj1.endsWith("."));
		char[] karakterler = new char[5];
		mesaj1.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj1.indexOf("av"));
		System.out.println(mesaj1.lastIndexOf("a"));
		
		System.out.println("--------------");
		
		//replace
		
		String yeniMesaj = mesaj1.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj1.substring(2,5));
		
		for (String kelime : mesaj1.split(" ")) {
			System.out.println(kelime);
			
		}
		
		System.out.println(mesaj1.toLowerCase());
		System.out.println(mesaj1.toUpperCase());
		
		System.out.println(mesaj1.trim());
		

		
		
		}
	
	}
			
	
	
			
			
		
		
		
		
		
		
		

	


