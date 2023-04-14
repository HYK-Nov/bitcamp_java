import java.io.*;

public class Test1384 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = 0;
        int groupNumber = 1;
        
        while(true) {
        	N = Integer.parseInt(br.readLine());
        	
        	if (N == 0) break;
        	
        	int count = 0;
        	String[][] group = new String[N][];
        	
        	bw.write("Group" + Integer.toString(groupNumber) + "\n");
        	
        	for (int i = 0; i < N; i++) group[i] = br.readLine().split(" ");
        	
        	for (int i = 0; i < group.length; i++) {
        		for (int j = 1; j < group[i].length; j++) {
					if (group[i][j].equals("N")) {
						bw.write(group[(i+N-j)%N][0] + " was nasty about " + group[i][0] + "\n");
						count++;
					}
				}
			}
        	
        	if (count == 0) bw.write("Nobody was nasty");
        	bw.newLine();
        	
        	groupNumber++;
        }
        
        bw.flush();
        bw.close();
	}

}
