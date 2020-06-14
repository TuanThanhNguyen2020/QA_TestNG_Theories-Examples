import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample {

    @Test(dataProvider = "LoginDataProvider",dataProviderClass=CustomDataProvider.class)
    public void loginTest(String email, String password){
        System.out.println(email+" "+password);
    }


}
