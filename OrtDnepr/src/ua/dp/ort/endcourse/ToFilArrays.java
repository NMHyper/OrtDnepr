package ua.dp.ort.endcourse;

public class ToFilArrays {

	public static void ArrayOutput (int height, int width, char character) {
		char[][] arrayRectangle = new char[height][width];

		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				arrayRectangle[i][j] = character;
				System.out.print(" " + arrayRectangle[i][j] + " ");

			}

			System.out.println();
		}
	}

}
