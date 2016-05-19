package BaseJava.craws;

public class CrawBaiDuMap {

	final static String filename = "E:\\data\\t.txt";

	public static void main(String[] args) {
		String strURL = null;
		StringBuffer sb = new StringBuffer();
		String page;
		int page_size = 50;// 每页多少个数据
		int scope = 1;// 1 基本信息 2 详细结果
		String query = "旅店";
		int page_num = 0; // 0代表第一页 1 代表第2页
		String region = "哈尔滨";
		int num = 100;
		PageTool pt = new PageTool();
		while (num-- != 0) {
			strURL = "http://api.map.baidu.com/place/v2/search"
					+ "?ak=iiwihENNUQGUrHWUEI5EF5hP&" 
					+ "output=json&query="
					+ query + "&" + "page_size=" + page_size + ""
					+ "&page_num=" + page_num + "" + "&scope=" + scope + ""
					+ "&region=" + region + "";
			page = pt.getPage(strURL);
			page_num++;
			sb.append(page);
		}
		System.out.println(strURL);
		WriteFileAdd wfa = new WriteFileAdd();
		wfa.appendMethodB(filename, sb.toString());
		System.out.println("数据准备完成");
		// System.out.println(page);

	}

}
