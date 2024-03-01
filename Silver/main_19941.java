import java.io.*;
import java.util.*;

public class Main {
	
	public static int N, K;
	public static char[] arr;
	public static boolean[] visited;
	public static int answer = 0;
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	arr = new char[N];
    	visited = new boolean[N];
    	
    	st = new StringTokenizer(br.readLine());
    	arr = st.nextToken().toCharArray();
    	
    	for(int i=0;i<N;i++) {
    		if(arr[i] == 'P') {
    			for(int j=-K;j<=K;j++) {
    				if( i+j >= N) break;
    				if( i+j < 0) continue;
    				
    				if(arr[i+j] == 'H' && visited[i+j] == false) {
    					visited[i+j] = true;
    					answer += 1;
    					break;
    				}
    			}
    		}
    	}	
    	System.out.println(answer);
    } 
}