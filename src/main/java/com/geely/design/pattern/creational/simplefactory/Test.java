package com.geely.design.pattern.creational.simplefactory;

/**
 * Created by geely
 *简单工厂严格意义上来说，并不属于23三种设计模式，更像是一种编码的风格和习惯 很多人会将简单工厂误认为工厂模式。
 *
 * 适用场景
 * 	1、工厂类负责创建的对象比较少
 * 	2、客户端只知道传入工厂类的参数，对于如何创建对象不关心
 * 优点
 * 	只需要传入一个正确的参数，就可以获取你所需要的对象，无需知道其创建细节加上必要的判断逻辑，根据参数创建不同的对象，实现对责任的分隔
 * 缺点
 * 	工厂类的职责相对过重，增加新的产品，需要修改工厂类的判断逻辑，违背开闭原则
 * 	1、增加类的个数（增加了系统的复杂度）
 *  2、无法形成基于继承的等级结构 原则不能全部遵守，也不能完全不遵守，需要把握一个度（根据实际的业务模型）
 */
public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();

/**
 * 简单工厂jdk中体现：
 * Calendar.java 中getInstance()
 * Calendar是抽象类，第一个图标中标识了；
 * 第二个图标代表权限，打开的锁代表public，圆点代表default权限；
 *
 * 简单工厂示例：
 * class.forName("com.mysql.jdbc.driver")；
 * DriverManager.getConnection(String url);
 * LoggerFactory.getLogger(Class clazz);方法
 */

    }

}
