package Devoir4;
import java.util.*;

public class Calendar2 extends GregorianCalendar {
	private boolean cours;
	public void creation(Calendar creation_date) {
		
		Calendar now = Calendar.getInstance();
		
		if(this.get(Calendar.DAY_OF_WEEK)==5 
				&& this.get(Calendar.HOUR_OF_DAY)<12 
				&& (this.get(Calendar.HOUR_OF_DAY)>9
				&& this.get(Calendar.MINUTE)>30)) 
		     { cours=true;}
	    else { cours=false;}
	}

 public void afficher(Calendar date_courante) {
	 String[] ids = TimeZone.getAvailableIDs(1 * 60 * 60 * 1000);
		if (ids.length == 0)
			System.exit(0);

	
		SimpleTimeZone pdt = new SimpleTimeZone(1 * 60 * 60 * 1000, ids[0]);
		Calendar calendar = new GregorianCalendar(pdt);
		Date trialTime = new Date();
		calendar.setTime(trialTime);
		
		int jour = calendar.get(Calendar.DAY_OF_MONTH);
		int mois = calendar.get(Calendar.MONTH) + 1;
		int annee =  calendar.get(Calendar.YEAR);
		int heure = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int seconde = calendar.get(Calendar.SECOND);
		
		System.out.print("Current Time: "+jour+"/"+mois+"/"+annee + " ");
		System.out.println(heure+":"+minute+":"+seconde);
	 }
 public void duree() {
	 GregorianCalendar date_courante=new GregorianCalendar();
		int Nombre_secondes=(date_courante.get(Calendar.HOUR)-this.get(Calendar.HOUR))*60*60+
				(date_courante.get(Calendar.MINUTE)-this.get(Calendar.MINUTE))*60+
				date_courante.get(Calendar.SECOND)-this.get(Calendar.SECOND);
		System.out.println(Nombre_secondes);
	}
 public boolean getCours() {
		return cours;
	}
 protected void computeFields() {
		
	}	
 }
