package ADT_SetContainerLASD_14_01_2009B;

import position.PositionList;
import set.Set;

public interface SetContainer<E> {

	/** crea un nuovo insieme avente come elementi gli elementi della lista L e lo inserisce nel contenitore
	 */
	public Set<E> insert(PositionList<E> L);
	
	/** aggiunge all�insieme S tutti gli elementi che sono nella lista L (si tralasci l�implementazione dell�eccezione 
	 *  relativa al caso in cui S non sia nel contenitore)
	 */
	public void add(Set<E> S, PositionList<E> L);
	
	/** rimuove dal contenitore l�insieme avente il minor numero di elementi e restituisce la lista degli elementi 
	 *  dell�insieme rimosso
	 */
	public PositionList<E> remove();
	
	/** restituisce la collezione iterabile degli insiemi che si trovano nel contenitore
	 */
	public Iterable<Set<E>> elements();
	
	public int size();
	
	public boolean isEmpty();
	
}
