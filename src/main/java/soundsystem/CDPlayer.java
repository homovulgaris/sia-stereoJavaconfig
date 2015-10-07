package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	
	private CompactDisc cd;
	
	/*
	 * indikuje, ze ked Spring vytvori CDPlayer bean
	 * tak ho ma inicializovat prave cez tento konstruktor a vlozit don bean,
	 * ktory je priraditelny ku CompactDisc
	 * 
	 * autowired nie je limitovany pre pouzitie iba pre konstruktory
	 * da sa pouzit napriklad aj pre settery
	 * 		@Autowired
			public void setCompactDisc(CompactDisc cd) {
				this.cd = cd;
			}
	 * 
	 * alebo na dalsie metody v triede ako napriklad
	 * 		@Autowired
			public void insertDisc(CompactDisc cd) {
				this.cd = cd;
			}
		Whether it’s a constructor, a setter method, or any other method, Spring will attempt
		to satisfy the dependency expressed in the method’s parameters. Assuming that one
		and only one bean matches, that bean will be wired in.
			
		da sa pouzit aj priznak @Autowired(required = false) - vtedy sa spring pokusi
		o autowiring, ale ak dany bean neexistuje, tak ponecha bean unwired
		
		ak vsak existuje viacer beanov, ktore vyhovuju (satisfies depenceny)
		potom spring vyhodi vynimku 
		
		@Autowired je springovo specificka anotacia, preto je mozne pouzivat jej ekvivalent
		a to konkretne @Inject. Opat su tam malicke rozdiely, ale v knihe sa nepreberali
	 */
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
		
	}

	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}
}
