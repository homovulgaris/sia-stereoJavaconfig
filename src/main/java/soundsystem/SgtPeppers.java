/**
 * 
 */
package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author marcin
 *
 */
@Component //anotacia, ktora ma na starsti autowiring pre tuto klasu vo forme
//takej, ze ComponentScan z nej vdaka tejto anotacii automaticky vytvori bean
/*
 * alternativou pre Component je anotacia Named, su tam male rozdieliky, ale fakt velmi male
 * Anotacia Component automaticky prideli ID pre bean tak, ze spravi lowercase prveho pismena danej triedy
 * ak chceme pouzit ine ID, tak bud pomocou @Named("pozadovaneID"), alebo @Component("pozadovanieID")
 */
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper`s Lonely Hearts Club Band";
	private String artist = "The Beatles";
	
	
	public void play() {
		// TODO Auto-generated method stub
	System.out.print("Playing " + title + " by " + artist);	
		
	}

}
