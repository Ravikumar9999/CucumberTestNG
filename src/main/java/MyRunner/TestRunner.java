package MyRunner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;



@CucumberOptions(
        features = "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\CucumberTestNG\\src\\main\\java\\Features\\login.feature",
        glue = {"stepDefinitions"},
        //tags = {"~@Ignore"},
        plugin = { "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt",
                "html:target/cucumber-html-reports/overview-features.html",
                "json:target/cucumber-reports/CucumberTestReport.json"}
                )
        

public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
//    public void feature(CucumberFeatureWrapper cucumberFeature) {
//        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//    }
 
    @DataProvider
 //   public Object[][] features() {
//        return testNGCucumberRunner.provideFeatures();
//    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}