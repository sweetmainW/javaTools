package editFile;

import java.io.File;

/**
 * 批量修改文件名
 * 把没有后缀的文件名 +".mp4"
 * @author 19218
 *
 */
public class EditFileName {

	public static void main(String[] args) {
		String filePath = "D:/learn/StudyVideo/李兴华Oracle/xcache";
		File file = new File (filePath);
		// 得到该目录下的所有文件
		File[] files = file.listFiles();
		// 遍历
		for (File file2 : files) {
			// 获得文件的原名字
			String file2Name = file2.getName();
			// 添加文件名后缀
			file2.renameTo(new File (filePath+file2Name+".mp4"));
		}
		
 	}

}
