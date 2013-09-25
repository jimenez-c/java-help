public class Liste {
	private Element premier;
	private Element dernier;

	public Liste() {
		premier = null;
		dernier = null;
	}

	public void ajoutTete(double val) {
		Element elmt = new Element(val);
		if(premier == null) {
			premier = elmt;
			dernier = elmt;
		}
		else {
			elmt.setSuivant(premier);
			premier = elmt;
		}
	}

	public void ajoutQueue(double val) {
		Element elmt = new Element(val);
		// if(dernier != null) {
			dernier.setSuivant(elmt);
			dernier = elmt;
		// }
	}

	public Element cherche(double item) {
		for(Element elmt = premier; elmt != null; elmt = elmt.getSuivant()) {
			if(item == elmt.getValeur()) {
				return elmt;
			}
		}
		return null;
	}

	public void retrait(double item) {
		if(premier == null) {
			System.out.println("t'es foutu !!!");
			return;
		}
		boolean found = false;
		for(Element elmt = premier; elmt != null; elmt = elmt.getSuivant()) {
			if(elmt.getSuivant() != null && elmt.getSuivant().getValeur() == item) {
				elmt.setSuivant(elmt.getSuivant().getSuivant());
				found = true;
			}
		}
		if(!found) {
			System.out.println("L'élément " + item + " n'est pas présent dans la liste.");
		}
	}


	public Element getDernier() {
		return dernier = null;
	}

	public String toString() {
		String retour = "";
		Element elmt = premier;

		// for(elmt = premier; elmt != null; elmt = elmt.getSuivant()) {
		// 	retour += elmt + "\n";
		// }
		while (elmt != null) {
			retour += elmt + "\n";
			elmt = elmt.getSuivant();
		}

		return retour;
	}
}