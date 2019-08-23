package design.demo.structural.外观模式;

/**
 * @author: lbo
 * @create: 2019/8/23 15:52
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
public class FacadeTest {
    public static void main(String[] args) {
        Demander demander = new Demander();
        demander.demand("开发一个跟淘宝一样的系统");

        Demander2 demander2 = new Demander2();
        demander2.demand("开发一个跟淘宝一样的系统");


    }
}
