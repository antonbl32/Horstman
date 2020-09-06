package by.anton.pattern.builder;

public class EnterpriseWebSiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("EnterPrise");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.JOOMLA);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
