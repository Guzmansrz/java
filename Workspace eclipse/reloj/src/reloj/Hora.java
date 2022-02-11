package reloj;

public class Hora {
	public int hh;
	public int mm;
	public int ss;
	
	public Hora() {
		setHh(0);
		setMm(0);
		setSs(0);
	}

	public Hora(int hh, int mm, int ss) {
		setHh(hh);
		setMm(mm);
		setSs(ss);
	}

	public int getHh() {
		return hh;
	}

	private void setHh(int hh) {
		this.hh = checkHora(hh);
	}

	public int getMm() {
		return mm;
	}

	private void setMm(int mm) {
		this.mm = checkMinySec(mm);
	}

	public int getSs() {
		return ss;
	}

	private void setSs(int ss) {
		this.ss = checkMinySec(ss);
	}
	
	private int checkHora(int tiempo) {
		if(tiempo>23 || tiempo<0) {
			return 0;
		}
		else 
			return tiempo;
	}

	private int checkMinySec(int tiempo) {
		if(tiempo>59 || tiempo<0) {
			return 0;
		}
		else 
			return tiempo;
		
	}

	public String verHora() {
		String hora = String.format("%02d", this.hh);
		String min = String.format("%02d", this.mm);
		String seg = String.format("%02d", this.ss);
		return hora + ":" + min + ":" + seg;
	}
	
	public static Hora sumaHoras(Hora h1, Hora h2) {
		int seg=0;
		int min=0;
		int hor=0;
		seg=h1.getSs()+h2.getSs();
		if(seg>60) {
			min++;
			seg-=59;
		}
		min+=h1.getMm()+h2.getMm();
		if(min>59) {
			hor++;
			min-=59;
		}
		hor+=h1.getHh()+h2.getHh();
		if(hor>23) {
			hor-=24;
		}
		Hora h3 = new Hora(hor, min, seg);
		return h3;
	}
	public void compararHoras(Hora h1, Hora h2) {
		if(h1.getHh()==h2.getHh()&&h1.getMm()==h2.getMm()&&h1.getSs()==h2.getSs()) {
			System.out.println("Las horas son iguales");
		}
		else
			System.out.println("Las horas no son iguales");
	}
	public void asignaHora(Hora h1) {
		setHh(h1.getHh());
		setMm(h1.getMm());
		setSs(h1.getSs());
	}
	public static boolean mayor_que(Hora h1, Hora h2){
		if(h1.getHh()>h2.getHh()) {
			return true;
		}else if(h1.getMm()>h2.getMm()&&h1.getHh()==h2.getHh()) {
			return true;
		}else if(h1.getSs()>h2.getSs()&&h1.getMm()==h2.getMm()&&h1.getHh()==h2.getHh()) {
			return true;
		}else 
			return false;
	}
	@Override
	public String toString() {
		return "Hora [hh=" + hh + ", mm=" + mm + ", ss=" + ss + "]";
	}
	
}
