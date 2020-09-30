import java.io.FileWriter;
import java.io.IOException;
public class FileWriting {
	
	public static void fileWriting() { //used in IsEmptyCheck.getStarted()
		
		int i;
		int j;
		int h;
		int m;
		
		DayTypes.readIn();
		Station.readInTrams();
		Station.readInBuses();
		Station.readInTrolleys();
		

	try {
			for(i=0;i<DayTypes.getDayTypes().size();i++) {
									
					for( j=0; j<Station.getStationNames2().size();j++) {	
						
						if(!(Station.getStationNames2().get(j).equals("Eur�pa-liget"))) {
							
							FileWriter file2a = new FileWriter("departure times\\"+"2 "+Station.getStationNames2().get(j)+" "+DayTypes.getDayTypes().get(i)+" Eur�pa-liget.txt");
						
							for( h=6; h<22; h++) {	
								for(m=0;m<60;m+=10) {
									file2a.write(" "+h+":"+m+"\n");
								}
							}
							file2a.close();		
						}
						
						if(!(Station.getStationNames2().get(j).equals("Szem�lyi p�lyaudvar"))) {
							
							FileWriter file2b = new FileWriter("departure times\\"+"2 "+Station.getStationNames2().get(j)+" "+DayTypes.getDayTypes().get(i)+" Szem�lyi p�lyaudvar.txt");

							for( h=6; h<22; h++) {	
								for(m=0;m<60;m+=10) {
									file2b.write(" "+h+":"+m+"\n");
								}	
							}		
							file2b.close();	
						}
					}
					
					for( j=0; j<Station.getStationNames3F().size();j++) {
						
						if(!(Station.getStationNames3F().get(j).equals("Tarj�n"))) {
							
							FileWriter file3Fa = new FileWriter("departure times\\"+"3F "+Station.getStationNames3F().get(j)+" "+DayTypes.getDayTypes().get(i)+" Tarj�n.txt");		
							for(h=6; h<22; h++) {	
								for(m=10;m<60;m+=15) {
									file3Fa.write(" "+h+":"+m+"\n");
								}
							}
							file3Fa.close();
						}
							
						if(!(Station.getStationNames3F().get(j).equals("Fon�gy�ri �t"))) {
							
							FileWriter file3Fb = new FileWriter("departure times\\"+"3F "+Station.getStationNames3F().get(j)+" "+DayTypes.getDayTypes().get(i)+" Fon�gy�ri �t.txt");		
							
							for(h=6; h<22; h++) {	
								for(m=10;m<60;m+=15) {
									file3Fb.write(" "+h+":"+m+"\n");
								}
							}
							file3Fb.close();
						}

					}
					
					for( j=0; j<Station.getStationNames4().size();j++) {
						
						if(!(Station.getStationNames4().get(j).equals("Kecsk�s"))) {
							
							FileWriter file4a = new FileWriter("departure times\\"+"4 "+Station.getStationNames4().get(j)+" "+DayTypes.getDayTypes().get(i)+" Kecsk�s.txt");
							
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=12) {
									file4a.write(" "+h+":"+m+"\n");
								}
							}
							file4a.close();
						}
						
						if(!(Station.getStationNames4().get(j).equals("Tarj�n"))) {
							
							FileWriter file4b = new FileWriter("departure times\\"+"4 "+Station.getStationNames4().get(j)+" "+DayTypes.getDayTypes().get(i)+" Tarj�n.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=12) {
									file4b.write(" "+h+":"+m+"\n");
								}
							}
							file4b.close();
						}
					}
					
					for( j=0; j<Station.getStationNames70().size();j++) {
								
						if(!(Station.getStationNames70().get(j).equals("F�v�szkert"))) {
							
							FileWriter file70a = new FileWriter("departure times\\"+"70 "+Station.getStationNames70().get(j)+" "+DayTypes.getDayTypes().get(i)+" F�v�szkert.txt");
							
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=14) {
									file70a.write(" "+h+":"+m+"\n");
								}
							}	
							file70a.close();
						}

						if(!(Station.getStationNames70().get(j).equals("Mars-t�r"))) {
							
							FileWriter file70b = new FileWriter("departure times\\"+"70 "+Station.getStationNames70().get(j)+" "+DayTypes.getDayTypes().get(i)+" Mars-t�r.txt");
							
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=14) {
									file70b.write(" "+h+":"+m+"\n");
								}
							}	
							file70b.close();
						}
					}
					
					for( j=0; j<Station.getStationNames71A().size();j++) {	
						
						if(!(Station.getStationNames71A().get(j).equals("Mars-t�r"))) {
							
							FileWriter file71Aa = new FileWriter("departure times\\"+"71A "+Station.getStationNames71A().get(j)+" "+DayTypes.getDayTypes().get(i)+" Mars-t�r.txt");
							
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=20) {
									file71Aa.write(" "+h+":"+m+"\n");
								}
							}					
							file71Aa.close();
						}
						
						if(!(Station.getStationNames71A().get(j).equals("Napf�nyf�rd�"))) {
							
							FileWriter file71Ab = new FileWriter("departure times\\"+"71A "+Station.getStationNames71A().get(j)+" "+DayTypes.getDayTypes().get(i)+" Napf�nyf�rd�.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=20) {
									file71Ab.write(" "+h+":"+m+"\n");
								}
							}					
							file71Ab.close();
						}
					}
					
					for( j=0; j<Station.getStationNames90H().size();j++) {
					
						if(!(Station.getStationNames90H().get(j).equals("Szegedi Ipari Logisztikai K�zpont"))) {
							
							FileWriter file90Ha = new FileWriter("departure times\\"+"90H "+Station.getStationNames90H().get(j)+" "+DayTypes.getDayTypes().get(i)+" Szegedi Ipari Logisztikai K�zpont.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=10) {
									file90Ha.write(" "+h+":"+m+"\n");
								}
							}	
							file90Ha.close();
						}
						
						if(!(Station.getStationNames90H().get(j).equals("Lugas utca"))) {

							FileWriter file90Hb = new FileWriter("departure times\\"+"90H "+Station.getStationNames90H().get(j)+" "+DayTypes.getDayTypes().get(i)+" Lugas utca.txt");
	
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=10) {
									file90Hb.write(" "+h+":"+m+"\n");
								}
							}	
							file90Hb.close();
						}
					}
					
					for( j=0; j<Station.getStationNames8().size();j++) {
						
						if(!(Station.getStationNames8().get(j).equals("Klinik�k"))) {
							FileWriter file8a = new FileWriter("departure times\\"+"8 "+Station.getStationNames8().get(j)+" "+DayTypes.getDayTypes().get(i)+" Klinik�k.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=5) {
									file8a.write(" "+h+":"+m+"\n");
								}
							}	
							file8a.close();
						}
						if(!(Station.getStationNames8().get(j).equals("Makkosh�z"))) {
							FileWriter file8b = new FileWriter("departure times\\"+"8 "+Station.getStationNames8().get(j)+" "+DayTypes.getDayTypes().get(i)+" Makkosh�z.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=5) {
									file8b.write(" "+h+":"+m+"\n");
								}
							}	
							file8b.close();
						}
					}
					
					for( j=0; j<Station.getStationNames10().size();j++) {
						
						if(!(Station.getStationNames10().get(j).equals("Klinik�k"))) {
							FileWriter file10a = new FileWriter("departure times\\"+"10 "+Station.getStationNames10().get(j)+" "+DayTypes.getDayTypes().get(i)+" Klinik�k.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=8) {
									file10a.write(" "+h+":"+m+"\n");
								}
							}	
							file10a.close();
						}
						if(!(Station.getStationNames10().get(j).equals("V�ztorony-t�r"))) {
							
							FileWriter file10b = new FileWriter("departure times\\"+"10 "+Station.getStationNames10().get(j)+" "+DayTypes.getDayTypes().get(i)+" V�ztorony-t�r.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=8) {
									file10b.write(" "+h+":"+m+"\n");
								}
							}	
							file10b.close();
						}
					}
					
					for( j=0; j<Station.getStationNames19().size();j++) {
					
						if(!(Station.getStationNames19().get(j).equals("Makkosh�z"))) {
							FileWriter file19a = new FileWriter("departure times\\"+"19 "+Station.getStationNames19().get(j)+" "+DayTypes.getDayTypes().get(i)+" Makkosh�z.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=12) {
									file19a.write(" "+h+":"+m+"\n");
								}
							}		
							file19a.close();
						}
						if(!(Station.getStationNames19().get(j).equals("V�ztorony-t�r"))) {
							FileWriter file19b = new FileWriter("departure times\\"+"19 "+Station.getStationNames19().get(j)+" "+DayTypes.getDayTypes().get(i)+" V�ztorony-t�r.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=12) {
									file19b.write(" "+h+":"+m+"\n");
								}
							}		
							file19b.close();
						}
						
					}
				//}
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}	