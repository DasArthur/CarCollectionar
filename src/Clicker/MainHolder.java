package Clicker;

public class MainHolder {
	
public Integer main[];
	
	public MainHolder(){
		//SITA MAN VISS AIZGAJA BET MAIN ARI VAR INITILIZET ARPUS MAINHOLDER KLASES
		//ARI var likt ieksa MakeMain void funckija sito for loop 
		//vnk testejot parliku te
		main = new Integer[8];
	
				for(int i=0; i <8;i ++){
					if(i ==4 || i ==5){
						MainMaker(1,i);
						
					}else{
						MainMaker(0,i);
					}
				}	
		
	}
	
	public void MainMaker(int k,int p){
		//NEBIJA SITAS un NEBIJA vel noradits integer prieks ARRAY POZICIJAS
		main[p] = k;
		
	}
	
	public void MakeMain(){
		

//
//		int i=0;
//		MainMaker(0,i); // Money
//		i++;
//		MainMaker(0,i); // Money Clicks
//		i++;
//		MainMaker(0,i); // Boxes
//		i++;
//		MainMaker(0,i); // Boxes Clicks
//		i++;
//		MainMaker(1,i); // Boxes Level
//		i++;
//		MainMaker(1,i); // Player Level
//		i++;
//		MainMaker(1,i); // Garage Level
//		i++;
//		MainMaker(0,i); // Garage Slots
		
	}
}
