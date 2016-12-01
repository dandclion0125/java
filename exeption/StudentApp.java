import java.io.*;
import java.util.*;
import java.lang.*;

public class StudentApp {
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		
		String text = reader.readLine();
		//System.out.println(text);

		String[] st1 = text.split(",");
		
		Student st = new Student();
		st.setName(st1[0]);
		st.setGrade(st1[1]);
		int kor1 = Integer.parseInt(st1[2]);
		st.setKor(kor1);
		int eng1 = Integer.parseInt(st1[3]);
		st.setEng(eng1);
		int math1 = Integer.parseInt(st1[4]);
		st.setMath(math1);

		System.out.println("이    름: " + st.getName());
		System.out.println("학    년: " + st.getGrade());
		System.out.println("국어점수: " + st.getKor());
		System.out.println("영어점수: " + st.getEng());
		System.out.println("수학점수: " + st.getMath());

		
		
		
	}
}