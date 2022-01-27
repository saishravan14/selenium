package demoselenium;

public class Anonomus_Innerclass {
public static void main(String[] args) {
	Watch w = new Watch(){
		@Override
		public void giveWatch() {
			System.out.println("Fossile Watch");
		}
	};
	w.giveWatch();
}
}
