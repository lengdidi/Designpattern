package decorator.v2;

/**
 * 装饰者模式
 */
public class Test {
    public static void main(String[] args) {
        AbstractBattercake abstractBattercake;
        abstractBattercake = new Battercake();
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new SausageDecorator(abstractBattercake);

        System.out.println(abstractBattercake.getDesc() + "销售价格：" + abstractBattercake.cost());
    }
}
