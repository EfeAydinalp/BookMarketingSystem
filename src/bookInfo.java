
public class bookInfo  {
    public String bookName;
    public String membershipType;
    public String startDate;
    public String endDate;
    public double price;

    public bookInfo(String bookName, String membershipType, String startDate, String endDate, double price) {
        this.bookName = bookName;
        this.membershipType = membershipType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
