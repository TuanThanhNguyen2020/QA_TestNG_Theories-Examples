import org.testng.annotations.Test;

public class GroupingExample {

    @Test(priority = 2,groups = {"sanity"})
    void test1(){
        System.out.println("This is test1...");
    }

    @Test(priority = 1,groups = {"sanity"})
    void test2(){
        System.out.println("This is test2...");
    }

    @Test(groups = {"regression"})
    void test3(){
        System.out.println("This is test3...");
    }

    @Test(groups = {"regression"})
    void test4(){
        System.out.println("This is test4...");
    }

    @Test(priority = 0,groups = {"sanity","regression"})
    void test5(){
        System.out.println("This is test5...");
    }
}
