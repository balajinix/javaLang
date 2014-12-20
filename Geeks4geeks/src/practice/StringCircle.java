package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringCircle {

	public static ArrayList<String> recursiveDFS(HashMap<String, ArrayList<String>> adjList,
			String key, ArrayList<String> path) {
		if (path.size() == adjList.size()) return path;
		path.add(key);
		ArrayList<String> final_path;
		ArrayList<String> neighbors = adjList.get(key);
		for (String neighbor : neighbors) {
			if (path.contains(neighbor)) continue;
			ArrayList<String> new_set = new ArrayList<String>(path);
			new_set.add(neighbor);
			final_path = recursiveDFS(adjList, neighbor, new_set);
			if (final_path != null) return final_path;
		}
		return null;
	}
		
	public static void main(String[] args) {
		
		List<ArrayList<String>> initList = new ArrayList<ArrayList<String>>();
		for (int i=0;i<26;i++) {
			ArrayList<String> alist = new ArrayList<String>();
			initList.add(alist);
		}
		HashMap<String, ArrayList<String>> adjList = new HashMap<String, ArrayList<String>>();
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		// populate initList, initialize adjList
		for (int i=0;i<n;i++) {
			String word = scanner.next();
			adjList.put(word, new ArrayList<String>());
			int w = word.charAt(0) - 'a';
			initList.get(w).add(word);
		}
		
		// populate adjList
		String key = "";
		for (Map.Entry<String, ArrayList<String>> entry : adjList.entrySet()) {
			key = entry.getKey();
			ArrayList<String> value = entry.getValue();
			int last = key.charAt(key.length() - 1) - 'a';
			for (String str : initList.get(last)) value.add(str);
		}
		
		ArrayList<String> path = recursiveDFS(adjList, key, new ArrayList<String>());
		if (path != null) {
			System.out.println("YES");
			System.out.println(path.toString());
		} else {
			System.out.println("NO");
		}
	}

}
