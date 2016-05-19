package BaseJava.algorithm;
/*
 * ��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
 */
public class differentNum {

    public static void main(String[] args) {

       int n;

       int count = 0;

        System.out.println("有1、2、3、4四个数字，能组成多少个互不相同且一个数字中无重复数字的三位数？并把他们都输入。");

        System.out.println("结果如下所示：");

       for (int i = 1; i <= 4; i++) {

           for (int j = 1; j <= 4; j++) {

              for (int k = 1; k <= 4; k++) {

                  if (i != j && j != k && i != k) {

                     count++;


                     System.out.println(i+""+j+""+k);


                  }

              }

           }

       }

        System.out.println("\n总个数为：" + count);

    }

}

