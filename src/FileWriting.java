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
						
						if(!(Station.getStationNames2().get(j).equals("Európa-liget"))) {
							
							FileWriter file2a = new FileWriter("departure times\\"+"2 "+Station.getStationNames2().get(j)+" "+DayTypes.getDayTypes().get(i)+" Európa-liget.txt");
						
							for( h=6; h<22; h++) {	
								for(m=0;m<60;m+=10) {
									file2a.write(" "+h+":"+m+"\n");
								}
							}
							file2a.close();		
						}
						
						if(!(Station.getStationNames2().get(j).equals("Személyi pályaudvar"))) {
							
							FileWriter file2b = new FileWriter("departure times\\"+"2 "+Station.getStationNames2().get(j)+" "+DayTypes.getDayTypes().get(i)+" Személyi pályaudvar.txt");

							for( h=6; h<22; h++) {	
								for(m=0;m<60;m+=10) {
									file2b.write(" "+h+":"+m+"\n");
								}	
							}		
							file2b.close();	
						}
					}
					
					for( j=0; j<Station.getStationNames3F().size();j++) {
						
						if(!(Station.getStationNames3F().get(j).equals("Tarján"))) {
							
							FileWriter file3Fa = new FileWriter("departure times\\"+"3F "+Station.getStationNames3F().get(j)+" "+DayTypes.getDayTypes().get(i)+" Tarján.txt");		
							for(h=6; h<22; h++) {	
								for(m=10;m<60;m+=15) {
									file3Fa.write(" "+h+":"+m+"\n");
								}
							}
							file3Fa.close();
						}
							
						if(!(Station.getStationNames3F().get(j).equals("Fonógyári út"))) {
							
							FileWriter file3Fb = new FileWriter("departure times\\"+"3F "+Station.getStationNames3F().get(j)+" "+DayTypes.getDayTypes().get(i)+" Fonógyári út.txt");		
							
							for(h=6; h<22; h++) {	
								for(m=10;m<60;m+=15) {
									file3Fb.write(" "+h+":"+m+"\n");
								}
							}
							file3Fb.close();
						}

					}
					
					for( j=0; j<Station.getStationNames4().size();j++) {
						
						if(!(Station.getStationNames4().get(j).equals("Kecskés"))) {
							
							FileWriter file4a = new FileWriter("departure times\\"+"4 "+Station.getStationNames4().get(j)+" "+DayTypes.getDayTypes().get(i)+" Kecskés.txt");
							
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=12) {
									file4a.write(" "+h+":"+m+"\n");
								}
							}
							file4a.close();
						}
						
						if(!(Station.getStationNames4().get(j).equals("Tarján"))) {
							
							FileWriter file4b = new FileWriter("departure times\\"+"4 "+Station.getStationNames4().get(j)+" "+DayTypes.getDayTypes().get(i)+" Tarján.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=12) {
									file4b.write(" "+h+":"+m+"\n");
								}
							}
							file4b.close();
						}
					}
					
					for( j=0; j<Station.getStationNames70().size();j++) {
								
						if(!(Station.getStationNames70().get(j).equals("Füvészkert"))) {
							
							FileWriter file70a = new FileWriter("departure times\\"+"70 "+Station.getStationNames70().get(j)+" "+DayTypes.getDayTypes().get(i)+" Füvészkert.txt");
							
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=14) {
									file70a.write(" "+h+":"+m+"\n");
								}
							}	
							file70a.close();
						}

						if(!(Station.getStationNames70().get(j).equals("Mars-tér"))) {
							
							FileWriter file70b = new FileWriter("departure times\\"+"70 "+Station.getStationNames70().get(j)+" "+DayTypes.getDayTypes().get(i)+" Mars-tér.txt");
							
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=14) {
									file70b.write(" "+h+":"+m+"\n");
								}
							}	
							file70b.close();
						}
					}
					
					for( j=0; j<Station.getStationNames71A().size();j++) {	
						
						if(!(Station.getStationNames71A().get(j).equals("Mars-tér"))) {
							
							FileWriter file71Aa = new FileWriter("departure times\\"+"71A "+Station.getStationNames71A().get(j)+" "+DayTypes.getDayTypes().get(i)+" Mars-tér.txt");
							
							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=20) {
									file71Aa.write(" "+h+":"+m+"\n");
								}
							}					
							file71Aa.close();
						}
						
						if(!(Station.getStationNames71A().get(j).equals("Napfényfürdõ"))) {
							
							FileWriter file71Ab = new FileWriter("departure times\\"+"71A "+Station.getStationNames71A().get(j)+" "+DayTypes.getDayTypes().get(i)+" Napfényfürdõ.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=20) {
									file71Ab.write(" "+h+":"+m+"\n");
								}
							}					
							file71Ab.close();
						}
					}
					
					for( j=0; j<Station.getStationNames90H().size();j++) {
					
						if(!(Station.getStationNames90H().get(j).equals("Szegedi Ipari Logisztikai Központ"))) {
							
							FileWriter file90Ha = new FileWriter("departure times\\"+"90H "+Station.getStationNames90H().get(j)+" "+DayTypes.getDayTypes().get(i)+" Szegedi Ipari Logisztikai Központ.txt");

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
						
						if(!(Station.getStationNames8().get(j).equals("Klinikák"))) {
							FileWriter file8a = new FileWriter("departure times\\"+"8 "+Station.getStationNames8().get(j)+" "+DayTypes.getDayTypes().get(i)+" Klinikák.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=5) {
									file8a.write(" "+h+":"+m+"\n");
								}
							}	
							file8a.close();
						}
						if(!(Station.getStationNames8().get(j).equals("Makkosház"))) {
							FileWriter file8b = new FileWriter("departure times\\"+"8 "+Station.getStationNames8().get(j)+" "+DayTypes.getDayTypes().get(i)+" Makkosház.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=5) {
									file8b.write(" "+h+":"+m+"\n");
								}
							}	
							file8b.close();
						}
					}
					
					for( j=0; j<Station.getStationNames10().size();j++) {
						
						if(!(Station.getStationNames10().get(j).equals("Klinikák"))) {
							FileWriter file10a = new FileWriter("departure times\\"+"10 "+Station.getStationNames10().get(j)+" "+DayTypes.getDayTypes().get(i)+" Klinikák.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=8) {
									file10a.write(" "+h+":"+m+"\n");
								}
							}	
							file10a.close();
						}
						if(!(Station.getStationNames10().get(j).equals("Víztorony-tér"))) {
							
							FileWriter file10b = new FileWriter("departure times\\"+"10 "+Station.getStationNames10().get(j)+" "+DayTypes.getDayTypes().get(i)+" Víztorony-tér.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=8) {
									file10b.write(" "+h+":"+m+"\n");
								}
							}	
							file10b.close();
						}
					}
					
					for( j=0; j<Station.getStationNames19().size();j++) {
					
						if(!(Station.getStationNames19().get(j).equals("Makkosház"))) {
							FileWriter file19a = new FileWriter("departure times\\"+"19 "+Station.getStationNames19().get(j)+" "+DayTypes.getDayTypes().get(i)+" Makkosház.txt");

							for(h=6; h<22; h++) {
								for(m=10;m<60;m+=12) {
									file19a.write(" "+h+":"+m+"\n");
								}
							}		
							file19a.close();
						}
						if(!(Station.getStationNames19().get(j).equals("Víztorony-tér"))) {
							FileWriter file19b = new FileWriter("departure times\\"+"19 "+Station.getStationNames19().get(j)+" "+DayTypes.getDayTypes().get(i)+" Víztorony-tér.txt");

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