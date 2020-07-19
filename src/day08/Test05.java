package day08;
/**
 * 使用异常捕获机制完成下述读取操作，并在finally中有关闭RandomAccessFile操作。
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后按照员工入职从晚到早的顺序依次输出员工信息。
 * 
 * 该文件560字节，每56个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为short,长度为2个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为long，长度为8个字节
 * 格式可参考当前包中emp.jpg图
 * @author Bonnie
 *
 */
public class Test05 {

}
