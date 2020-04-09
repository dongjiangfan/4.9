package combw.common;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.bw.common.DateUtils;
import com.bw.common.FileUtils;

public class test {

	public static class Cess {
		public static void main(String[] args) throws IOException {
			//获取月初
			Date date=new Date(2020, 4,3);
			java.util.Date bom = DateUtils.getBOM(date);
			SimpleDateFormat format=new SimpleDateFormat();
			String format2 = format.format(bom);
			System.out.println("月初"+format2);
			//获取月末
			java.util.Date bom1 = DateUtils.getEOM(date);
			SimpleDateFormat forma1t=new SimpleDateFormat();
			String format1 = format.format(bom1);
			System.out.println("月末"+format1);
			String a="D:/aaa.txt";
			//读取流
			List<String> readFile = FileUtils.readFile(a);
			for (String string : readFile) {
				System.out.println(string);
			}
			//复制文件
			String c="D:/bbb.txt";
			FileUtils.copy(a, c);
		}
		
	}
}
