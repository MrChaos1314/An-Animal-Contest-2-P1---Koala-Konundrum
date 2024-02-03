package competitive_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main v = new Main();
        v.run();
    }

    public void run() throws IOException{
        System.out.println(palindromMadnis());
    }

    public String palindromMadnis() throws IOException{
        char letter = 'a';
        String solution = "";
        int a = 0;        
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n = 0;
        int o = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int t = 0;
        int u = 0;
        int v = 0;
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lengthOfMuttering = Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        String muttering = st.nextToken();

        //Den String in einen Array an Chars packen
        char[] mutteringArray = muttering.toCharArray();

        for(int in = 0; in < lengthOfMuttering; in++){
            letter = mutteringArray[in];
            switch (letter) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                case 'c':
                    c++;
                    break;
                case 'd':
                    d++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'f':
                    f++;
                    break;
                case 'g':
                    g++;
                    break;
                case 'h':
                    h++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'j':
                    j++;
                    break;
                case 'k':
                    k++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'm':
                    m++;
                    break;
                case 'n':
                    n++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'p':
                    p++;
                    break;
                case 'q':
                    q++;
                    break;
                case 'r':
                    r++;
                    break;
                case 's':
                    s++;
                    break;
                case 't':
                    t++;
                    break;
                case 'u':
                    u++;
                    break;
                case 'v':
                    v++;
                    break;
                case 'w':
                    w++;
                    break;
                case 'x':
                    x++;
                    break;
                case 'y':
                    y++;
                    break;
                case 'z':
                    z++;
                    break;        
            }
        }

        int count = 0;

        if(a % 2 != 0){
            count++;
        }
        
        if(b % 2 != 0){
            count++;
        }
        
        if(c % 2 != 0){
            count++;
        }
        
        if(d % 2 != 0){
            count++;
        }
        
        if(e % 2 != 0){
            count++;
        }
        
        if(f % 2 != 0){
            count++;
        }
        
        if(g % 2 != 0){
            count++;
        }
        
        if(h % 2 != 0){
            count++;
        }
        
        if(i % 2 != 0){
            count++;
        }
        
        if(j % 2 != 0){
            count++;
        }
        
        if(k % 2 != 0){
            count++;
        }
        
        if(l % 2 != 0){
            count++;
        }
        
        if(m % 2 != 0){
            count++;
        }
        
        if(n % 2 != 0){
            count++;
        }
        
        if(o % 2 != 0){
            count++;
        }
        
        if(p % 2 != 0){
            count++;
        }
        
        if(q % 2 != 0){
            count++;
        }

        if(r % 2 != 0){
            count++;
        }
        
        if(s % 2 != 0){
            count++;
        }
        
        if(t % 2 != 0){
            count++;
        }
        
        if(u % 2 != 0){
            count++;
        }
        
        if(v % 2 != 0){
            count++;
        }
        
        if(w % 2 != 0){
            count++;
        }
        
        if(x % 2 != 0){
            count++;
        }

        if(y % 2 != 0){
            count++;
        }
        
        if(z % 2 != 0){
            count++;
        }

        if(count == 0){
            count = 1;
        }

        solution = String.valueOf(count);
        

        return solution;
    }
}