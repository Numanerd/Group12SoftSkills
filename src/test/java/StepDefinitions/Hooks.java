package StepDefinitions;
import Utilities.GWD_old;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;


public class Hooks {
    @After   // her senaryodan sonra otomatik çalışır. cucumber özelliğidir
    public void after(Scenario senaryo){

            System.out.println("senaryo bitti");


        if (senaryo.isFailed()){
            //TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
           //final byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            //senaryo.attach(hafizadakiHali, "image/png","screen shot");
        }
        GWD_old.quitDriver();

    }
}
