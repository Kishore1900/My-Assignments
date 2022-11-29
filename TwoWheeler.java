package week1.day2;

public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chasisNumber=63746787534L;
	boolean isPunctured=false;
	String bikeName="Royal Enfield";
	double runningKM=1589.98;
	
	public static void main(String[] args)
{
		TwoWheeler bike=new TwoWheeler();
		System.out.println("noOfWheels "+bike.noOfWheels);
		System.out.println("noOfMirrors "+bike.noOfMirrors);
		System.out.println("chasisNumber "+bike.chasisNumber);
		System.out.println("isPunctured "+bike.isPunctured);
		System.out.println("bikeName "+bike.chasisNumber);
		System.out.println("runningKM "+bike.runningKM);
	}

}
