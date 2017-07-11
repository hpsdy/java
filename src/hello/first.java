package hello;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.*;
class p{
	public static  int one=0;
	public int two=10;
	public p(int p){
		two = p;
	}
}
public class first {
	public static void main(String[] args) {
		/*p a = new p(100);
		p b = a;
		a.two=1000;
		System.out.println(a.two);
		System.out.println(b.two);
		char w = 'c';
		String sw = Character.toString(w);
		System.out.println(getType(w));
		System.out.println(sw);
		String xx = "hello";
		String yy = xx;
		yy = "world";
		System.out.println(xx);
		System.out.println(yy);
		char [] xy = {'a','b'};
		System.out.println(xy);
		int a = 120;
		byte b = (byte)a;
		System.out.println("hello world");
		System.out.println(a);
		System.out.println(b);
		char c = '1';
		String d = "123";
		System.out.println(p.one);
		p.one=10;
		System.out.println(p.one);
		new p();
		new p();
		test xxx = new test();
		xxx.one();
		xxx.two();
		xxx.three();
		String [] names = {"qin","han"};
		for(String name:names) {
			System.out.println(name);
		}
		System.err.println(Math.PI);
		Integer test = 1234;
		Integer cpTest = test;
		test = 4321;
		System.out.println(test);
		System.out.println(cpTest);
		/*String stest = test.toString();
		int itest = (int)test;
		int inta = 100;
		Integer intea = 100;
		if(inta==intea) {
			System.out.println("相等");
		}
		System.out.println(getType(test));
		System.out.println(getType(stest));
		System.out.println(getType(itest));
		System.out.println(getType(inta));
		char a = 'a';
		System.out.println((int)a);
		System.out.println(test.intValue());
		System.out.println(Integer.valueOf(inta).compareTo(inta));
		System.out.println(getType(Integer.parseInt("222")));
		System.out.println(getType(a));
		System.out.printf("浮点型变量的的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", 1f, 2, 3);
		String str = String.format("xx %s,%d", 123,321);
		System.out.println(str);*/
		
		/*String xxx = "hello world@秦";
		byte [] yyy = xxx.getBytes();
		for(byte x:yyy) {
			System.out.println(x+"\n");
		}*/
		String Str = new String("www.google.com");
		System.out.println("origin:"+Str);
		System.out.print("匹配成功返回值 :" );
		System.out.println(Str.replaceAll("(.*)google(.*)","runoob" ));
		System.out.println(Str);
		System.out.print("匹配失败返回值 :" );
		System.out.println(Str.replaceAll("(.*)taobao(.*)","runoob" ));
		System.out.println(Str);
		
		String src = new String("333aaabbb444");
		System.out.println(src.replace("3","f"));//=>ab4f2c4fd
		System.out.println(src);
		System.out.println(src.replace('3','f'));//=>ab4f2c4fd.
		System.out.println(src.replaceAll("\\d","f"));//=>abffafcffd
		System.out.println(src.replaceAll("a","f"));//=>fb43fc23d.
		String n = "x.y.z";
		String [] narr = n.split("\\.");
		for(String x:narr) {
			System.out.println(x);
		}
		String [] arr = {"a","b","d","c","a","e"};
		int index = Arrays.binarySearch(arr,"e");
		Date date = new Date();
		System.out.println(date);
		long t1 = System.currentTimeMillis();
		long t2 = date.getDate();
		String t3 = String.format("%tT", date);
		System.out.println(t3);
		SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String t4 = dformat.format(date);
		try {
			Thread.sleep(5000);
			System.out.println(t4);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static String getType(Object test) {
		// TODO Auto-generated method stub
		return test.getClass().toString();
	}
}
