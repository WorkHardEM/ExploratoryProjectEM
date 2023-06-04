package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class MyListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        System.out.println("Тест запустися");
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.println("Тест завершился");
    }
}
