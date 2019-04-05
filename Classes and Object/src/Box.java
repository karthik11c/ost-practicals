import java.util.Scanner;

public class Box {

	
	private int length;
	private int width;
	private int height;
	public Box(int len, int wid, int hei) {
		// TODO Auto-generated constructor stub
		this.length= len;
		this.width=wid;
		this.height=hei;
	}
	public int VolumnOfBox() {
		int volumn=length*width*height;
		return volumn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the length, width and  base ll");
		
		int h=input.nextInt();
		int w=input.nextInt();
		int b=input.nextInt();
		Box obj=new Box(h, w, b);
		System.out.println("Volumn "+obj.VolumnOfBox());
	}

}
