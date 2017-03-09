package testcases;


import org.junit.Test;
import pageobject.SomePageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by ecenanovic on 24/02/2017.
 */
public class Tests {
@Test
    public void navigateToThePageTest(){

    final SomePageObject navigateToUrl = new SomePageObject();
    navigateToUrl.goToWebsite();

}
}
