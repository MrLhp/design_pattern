package com.geely.design.pattern.creational.simplefactory;

/**
 * Created by geely
 * 将VideoFactory方法写成静态方法，通过静态方法定义一个简单工厂
 * 使用静态方法比较方便，直接调用即可，但如果是静态方法，无法通过继承改变它的行为
 * 如果VideoFactory并没有被继承、重写的需求，直接使用静态方法是可以的.
 */
public class VideoFactory {
    /**
     * 通过反射进行调用
     * @param c
     * @return
     */
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

    /**
     *通过传入的参数进行判断
     * @param type
     * @return
     */
    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

}
