public class TestListe {
	public static void main(String[] args) {
		Liste l = new Liste();
		l.ajoutTete(12);
		l.ajoutTete(17);
		l.ajoutTete(7);

		l.ajoutQueue(19);
		l.ajoutQueue(45);

		l.ajoutTete(5);

		// Element resultat = l.cherche(7);
		l.retrait(99);
		System.out.println(l);
		// System.out.println(l.getDernier());

	}
}