package BaseJava.readFile;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
public class FileBVisible {
	public static void main(String[] args) throws Exception
	{

		Files.walkFileTree(Paths.get("D:","jre7"), new FileVisitor(){

			public FileVisitResult preVisitDirectory(Object dir,
													 BasicFileAttributes attrs) throws IOException {
				//访问文件夹之前调用
				System.out.println(dir);
				return FileVisitResult.CONTINUE;
			}

			public FileVisitResult visitFile(Object file,
											 BasicFileAttributes attrs) throws IOException {
				// 访问文件调用
				System.out.println(file);
				return FileVisitResult.CONTINUE;
			}

			public FileVisitResult visitFileFailed(Object file, IOException exc)
					throws IOException {
				// 访问文件失败时调用
				return FileVisitResult.CONTINUE;
			}

			public FileVisitResult postVisitDirectory(Object dir,
													  IOException exc) throws IOException {
				// 访问文件夹之后调用
				return FileVisitResult.CONTINUE;
			}

		});
	}
}
