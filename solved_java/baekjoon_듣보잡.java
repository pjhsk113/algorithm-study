package solved;

import java.io.*;
import java.util.*;

/*
    중복 제거가 핵심이넹 ㅋㅋ
 */
public class baekjoon_듣보잡 {
//    public static void main(String[] args) throws IOException {
//        int n, m = 0;
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(in.readLine());
//
//        Set<String>  list = new HashSet<>();
//        ArrayList<String>  ans = new ArrayList<>();
//
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//
//        for(int i=0;i<n;i++) {
//            list.add(in.readLine());
//        }
//        for(int i=0;i<m;i++) {
//            String temp = in.readLine();
//            if(list.contains(temp)) {
//                ans.add(temp);
//            }
//        }
//
//        out.write(ans.size() + "\n");
//        Collections.sort(ans);
//        for(String s : ans) {
//            out.write(s + "\n");
//        }
//        out.flush();
//        in.close();
//        out.close();
//    }
    public static void main(String[] args) {
        int n, m = 0;

        Set<String> list = new HashSet<>();
        ArrayList<String> ans = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if (list.contains(s)) {
                ans.add(s);
            }
        }
        System.out.println(ans.size());
        Collections.sort(ans);
        for (String s : ans) {
            System.out.println(s);
        }
    }
}
