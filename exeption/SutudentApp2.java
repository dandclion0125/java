import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;

public class SutudentApp2 {
	public static Student parseData(String text){
		Student st = new Student();
		String[] arr = text.split(",");
		st.setName(arr[0]);
		st.setGrade(arr[1]);
		int kor1 = Integer.parseInt(arr[2]);
		st.setKor(kor1);
		int eng1 = Integer.parseInt(arr[3]);
		st.setEng(eng1);
		int math1 = Integer.parseInt(arr[4]);
		st.setMath(math1);
		
		return st;
	}

	public static void main(String[] args) throws Exception {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		Student[] students = new Student[10];

		BufferedReader reader = new BufferedReader(new FileReader("score.txt"));
		
		for (int i=0 ; i<students.length ; i++) {
			students[i] = parseData(reader.readLine());
		}
		System.out.println(" 이  름  학  년  국어  영어  수학  총점  평균 ");
		for (Student st: students) {
			
			
			System.out.printf(" %s   %s    %d    %d    %d   %d  %s \n",st.getName(),st.getGrade(),st.getKor(),st.getEng(),st.getMath(),st.getTotal(),df.format(st.getAvg()));
		}
		
	}
}