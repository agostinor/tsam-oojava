
public class CambiaMonete {
	public static void main(String[] args){
		System.out.println(numeroBanconote(56, "", 0));
	}
	
	public static String numeroBanconote(int soldi, String stringa,int i){
		if(soldi<1){
			return stringa;
		} else{
			if(i>0){
				stringa += "-";
			}
			i++;
			if(soldi >= 500){
				soldi -= 500;
				stringa += "500";
				return numeroBanconote( soldi, stringa, i);
			} else if(soldi >= 200){
				soldi -= 200;
				stringa += "200";
				return numeroBanconote( soldi, stringa, i);
			} else if(soldi >= 100){
				soldi -= 100;
				stringa += "100";
				return numeroBanconote( soldi, stringa, i);
			} else if(soldi >= 50){
				soldi -= 50;
				stringa += "50";
				return numeroBanconote( soldi, stringa, i);
			} else if( soldi >= 20){
				soldi -= 20;
				stringa += "20";
				return numeroBanconote( soldi, stringa, i);
			} else if( soldi >= 10){
				soldi -= 10;
				stringa += "10";
				return numeroBanconote( soldi, stringa, i);
			} else if( soldi >= 5){
				soldi -= 5;
				stringa += "5";
				return numeroBanconote( soldi, stringa, i);
			} else if(soldi >=2){
				soldi -= 2;
				stringa += "2";
				return numeroBanconote( soldi, stringa, i);
			} else{
				soldi -= 1;
				stringa += "1";
				return numeroBanconote( soldi, stringa, i);
			}
		}
		
	}
}