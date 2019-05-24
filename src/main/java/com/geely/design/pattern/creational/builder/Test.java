package com.geely.design.pattern.creational.builder;

/**
 * Created by geely
 * 建造者模式：
 * 定义：讲一个复杂对象的构建与它的标识分离，使得同样的构建过程可以创建不同的表示；
 * 用户只需指定需要建造的类型就可以得到它们，建造过程及细节不需要知道；
 * 类型:创建型
 * 使用场景：如果一个对象有非常复杂的内部结构（很多属性）；想把复杂对象的创建和使用分离；
 * 优点：封装性好，创建和使用分离；扩展性好，建造类之间独立、一定程度上解耦；
 * 缺点：产生多余的Builder对象；产品内部发生变化，建造者都要修改，成本较大；
 * 建造者模式与工厂模式的区别：
 * 建造者模式更注重于方法的调用顺序；工厂模式注重于创建产品；
 * 建造者可以创建比较复杂的产品；创建者模式不但要创建产品，还需要知道产品的组成；
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);

    }
}
