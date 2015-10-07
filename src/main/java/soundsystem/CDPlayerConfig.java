package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
 * anotacia @Configuration je zakladom pre vytvorenie konfiguracie v ramci Java
 * je to konfiguracna classa, ktora by mala obsahovat detaily o beanoch,
 * ktore by sa mali vytvorit v ramci spring aplikacneho kontextu
 * 
 *
 */
public class CDPlayerConfig {

	@Bean
	/*
	 * tato anotacia vravi Sprigu, ze tato metoda vrati objekt, ktory
	 * by mal byt registrovany ako bean v aplikacnom kontexte
	 * telo tejto metody obsahuje logiku, ktora sa okamzite pri vytvoreni
	 * instancie beanu vykona
	 * Telo tejto metody teda vratni novu instanciu SgtPeppers
	 */
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}
	
	
//	@Bean
//	public CompactDisc randomBeatlesCD(){
//		int choice = (int) Math.floor(Math.random() *4);
//		if(choice == 0){
//			return new SgtPeppers();
//		}else if(choice == 1){
//			return new SgtPeppers();
//		}else if(choice == 2){
//			return new WhiteAlbum();
//		}else if(choice == 3){
//			return new HardDaysNight();
//		}else{
//			return new Revolver();
//		}
//	}
	
	@Bean
	public CDPlayer cdPlayer(){
		return new CDPlayer(sgtPeppers());
		
	}
	
	/*
	 * 	If the call to sgtPeppers() was treated like any other call to a Java method, then each
		CDPlayer would be given its own instance of SgtPeppers. That would make sense if we
		were talking about real CD players and compact discs. If you have two CD players,
		there’s no physical way for a single compact disc to simultaneously be inserted into
		two CD players.
		In software, however, there’s no reason you couldn’t inject the same instance of
		SgtPeppers into as many other beans as you want. By default, all beans in Spring are
		singletons, and there’s no reason you need to create a duplicate instance for the second
		CDPlayer bean. So Spring intercepts the call to sgtPeppers() and makes sure
		that what is returned is the Spring bean that was created when Spring itself called
		sgtPeppers() to create the CompactDisc bean. Therefore, both CDPlayer beans will
		be given the same instance of SgtPeppers.
	 */
	
}
