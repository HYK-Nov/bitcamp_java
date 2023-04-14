import java.io.*;

public class Test25206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        float avgValue = 0;
        float credit = 0;
        
        for (int i = 0; i < 20; i++) {
        	String[] infoArr = br.readLine().split(" ");
			
			if (infoArr[2].equals("P")) continue;
			
			switch (infoArr[2]) {
				case "A+": avgValue += (float)4.5 * Float.parseFloat(infoArr[1]); break;
				case "A0": avgValue += (float)4.0 * Float.parseFloat(infoArr[1]); break;
				case "B+": avgValue += (float)3.5 * Float.parseFloat(infoArr[1]); break;
				case "B0": avgValue += (float)3.0 * Float.parseFloat(infoArr[1]); break;
				case "C+": avgValue += (float)2.5 * Float.parseFloat(infoArr[1]); break;
				case "C0": avgValue += (float)2.0 * Float.parseFloat(infoArr[1]); break;
				case "D+": avgValue += (float)1.5 * Float.parseFloat(infoArr[1]); break;
				case "D0": avgValue += (float)1.0 * Float.parseFloat(infoArr[1]); break;
				default: avgValue += (float)0.0 * Float.parseFloat(infoArr[1]); break;
			}
			
			credit += Float.parseFloat(infoArr[1]);
		}
        
        bw.write(Float.toString(avgValue / credit) + "\n");
        
        bw.flush();
        bw.close();
	}

}

