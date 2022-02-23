package Ch16;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class P432 {
	public static void main(String[] args) {
		
		try {
			System.out.println("list() �޼��带 �̿��Ͽ� ��Ʈ�� �����ϱ�");
			Path path = Paths.get("src");
			Stream<Path> sr1 = Files.list(path);
			sr1.forEach(p -> System.out.println(p.getFileName()));
			
			System.out.println("find() �޼��带 �̿��Ͽ� ��Ʈ�� �����ϱ�");
			Stream<Path> sr2 = Files.find(path, 10, (p,  BasicFileAttributes) -> {File file = p.toFile();
				return !file.isDirectory() && file.getName().contains("P4");
			});
			sr2.forEach(p -> System.out.println(p.getFileName()));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
