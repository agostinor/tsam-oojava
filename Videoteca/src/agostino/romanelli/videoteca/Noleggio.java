package agostino.romanelli.videoteca;


public class Noleggio {

		private Film[] film;
		
		public int totaleNoleggi() {
			int tot = 0;
			for(Film fl: film) {
				tot += fl.CostoNoleggio();
			}
			return tot;
		}

		public Film[] getFilm() {
			return film;
		}

		public void setFilm(Film[] film) {
			this.film = film;
		}
	
}
