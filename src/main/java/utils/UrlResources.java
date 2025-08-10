package utils;

public enum UrlResources {
    REGISTER_PAGE("https://parabank.parasoft.com/parabank/register.htm"),
    LOGIN_PAGE("https://parabank.parasoft.com/parabank/index.htm");
    private final String url;

    private UrlResources(String url) {
        this.url = url;
    }
    public String getUrl() {
        return this.url;
    }
}
