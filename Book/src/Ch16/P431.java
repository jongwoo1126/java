package Ch16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class P431 {
	public static void main(String[] args) {
		
		try {
			
			Path path = Paths.get("src/Ch16/430.java");
			Stream<String> stream = Files.lines(path,Charset.defaultCharset());
			stream.forEach(s -> System.out.println(s));
			stream.close();
			System.out.println();
			
			File file = path.toFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.lines().forEach(s  -> System.out.println(s));
			stream.close();
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
