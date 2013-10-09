public class Maison extends Batiment {
	private int nbPieces;
	private boolean aPiscine;

	/* const */
	private final static double PRIX_PIECE = 50;
	private final static int NB_PIECE_DEFAUT = 4;
	private final static boolean A_PISCINE_DEFAUT = false;

	public Maison(String proprietaire, String adresse, double surface, int nbPieces, boolean aPiscine) {
		super(proprietaire, adresse, surface);
		this.nbPieces = nbPieces;
		this.aPiscine = aPiscine;
	}

	public Maison(String proprietaire, String adresse, double surface) {
		this(proprietaire, adresse, surface, NB_PIECE_DEFAUT, A_PISCINE_DEFAUT);
	}

	public double calculerImpots() {
		double impots = PRIX_PIECE * nbPieces;
		if(aPiscine) {
			impots += 4000;
		}
		return impots;
	}
}