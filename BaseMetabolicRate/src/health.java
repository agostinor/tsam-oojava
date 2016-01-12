public class health {

	
	double CalcolatorMB(Person[] students) {
		double tot = 0;
		for(Person s: students) {
			if(s.sex == "f"){
				tot = (655 + (9.6 * s.kg) + (1.8 * s.cm) - (4.7 * s.eta));
			}else{
				tot = (655 + (13.8 * s.kg) + (1.8 * s.cm) - (4.7 * s.eta));
			}
			
			if(s.activity =="sedentario"){
					tot = tot + tot/5; 
				} else if(s.activity == "moderatamente attivo"){
					tot = tot + tot/3; 
				} else if(s.activity == "attivo"){
					tot = tot + (tot/10)*4;
				}else {
					tot = tot + tot/2;
				}
		}
		return tot;
	}
	
}