package by.anton.pattern.builder;

public class VisitCardSiteBuilder  extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("VisitCard");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
