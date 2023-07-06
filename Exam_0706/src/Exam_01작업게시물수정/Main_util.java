package Exam_01작업게시물수정;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_util {
		public static String getNowDateStr() {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date time = new Date();
			return format.format(time);
		}
	}
