import java.util.Scanner;
public class ShowPics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Picture puppy = new Picture("puppy.jpg");
puppy.draw();

Picture puppy2 = new Picture("puppy.jpg");
puppy2.translate(200, 1);
puppy2.draw();
	}

}
