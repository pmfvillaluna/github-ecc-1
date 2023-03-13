package com.exist.ecc.app;
import com.exist.ecc.service.Ex3Actions;
public class Main {
    public static void main(String[] args) {
		String files[] = new String[2];
        files[0] = "src/main/resources/text-files/txt1.txt";
		files[1] = "src/main/resources/text-files/txt2.txt";
		Ex3Actions exercise3 = new Ex3Actions();
		exercise3.selection(files);
	}
}
