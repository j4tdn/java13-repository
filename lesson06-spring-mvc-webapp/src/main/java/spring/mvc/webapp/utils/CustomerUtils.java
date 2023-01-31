package spring.mvc.webapp.utils;

public class CustomerUtils {

    public static final Integer customerPerPage = 8;
    public static final Integer defaultPage = 1;
    public static final String defaultDir = "asc";
    public static final String defaultKeyword = "";
    public static final String defaultPro = "first_name";

    private CustomerUtils() {

    }

    public static Integer getOffset(Integer pageNum) {
        return (pageNum - 1) * customerPerPage;
    }

    public static Integer getTotalPage(Integer totalCustomers) {
        return Math.ceilDiv(totalCustomers, CustomerUtils.customerPerPage);
    }
}
