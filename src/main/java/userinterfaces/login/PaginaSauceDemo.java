package userinterfaces.login;

import net.thucydides.core.pages.PageObject;

public class PaginaSauceDemo extends PageObject {
    public PaginaSauceDemo() {
        super();
        String url = "https://www.saucedemo.com/";
        setDefaultBaseUrl(url);
    }
}
