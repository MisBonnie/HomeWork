package day12;
/**
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，id从1开始，自动为每个员工分配。之后按照emp.xml的格式将
 * 这些员工写入到emplist.xml文档中
 * 该文件800字节，每80个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为int,长度为4个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为字符串，长度为30个字节，编码为:UTF-8  内容格式:yyyy-MM-dd(由于长度30，后面可能会存在空白，注意去除)
 * 格式可参考当前包中emp.jpg图
 * @author Bonnie
 *
 */
public class Test03 {

}
