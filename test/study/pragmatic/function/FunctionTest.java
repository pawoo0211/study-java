package study.pragmatic.function;


import org.junit.jupiter.api.Test;

public class FunctionTest {

    @Test
    void 반환값_없는_함수형_인터페이스() {
        Printer printer1 = new Printer() {
            @Override
            public void print() {
                System.out.println("출력1");
            }
        };

        Printer printer2 = () -> {
            System.out.println("출력2");
        };

        Printer printer3 = () -> System.out.println("출력3");

        Printer printer4 = () -> {
            System.out.println("출력4");
            System.out.println("출력4");
        };

        printer1.print();
        printer3.print();
    }

    @Test
    void 반환값_있는_함수형_인터페이스() {
        Returner returner1 = () -> { return 1; };
        Returner returner2 = () -> 2;
        System.out.println("return1 : " + returner1.returnObj());
        System.out.println("return2 : " + returner2.returnObj());
    }

    @Test
    void 인자값_있는_함수형_인터페이스() {
        SingleParam singleParam1 = (index) -> System.out.println(index);

        singleParam1.func(100);
    }

    @Test
    void 반환값_인자값_있는_함수형_인터페이스() {
        DoubleParam doubleParam = (int a, int b) -> a + b;
        System.out.println("result : " + doubleParam.add(1, 2));
    }
}