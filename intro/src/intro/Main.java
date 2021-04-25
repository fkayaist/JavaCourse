package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String internetSubeButon = "Ýnternet þubeye gir";
		System.out.println(internetSubeButon);
		
		String [] krediler =
			{
				"1-Hýzlý Kredi",
				"2-Mutlu Emekli Kredisi",
				"3-Çiftçi Kredisi",
				"4-Kamu Çalýþaný Kredisi",
				" "
			};

			//foreach
			for (String kredi:krediler) {
				System.out.println(kredi);
			}

			for(int i=0; i<krediler.length;i++) {
				System.out.println(krediler[i]);
			}
			
			//deðer tip, direkt deðeri atar.
			int sayi1 = 10;
			int sayi2 = 20;
			sayi1 = sayi2;
			sayi2 = 100;
			System.out.println(sayi1);
			
			//referans tip, bellekteki referans deðeri atar, örneðin sayilar1'in tutulduðu belleðin deðerini. 101 nolu bellek mesela
			int[] sayilar1 = {1,2,3,4,5};
			int[] sayilar2 = {10,20,30,40,50,60};
			sayilar1 = sayilar2;
			sayilar2[0] = 100;
			System.out.println(sayilar1[0]);

			//referans tip olarak tutuluyor ancak istisna olarak deðer tip tutuyor
			String sehir1 = "Ankara";
			String sehir2 = "Ýstanbul";
			sehir1 = sehir2;
			sehir2 ="Ýzmir";
			System.out.println(sehir1);
	}

}
