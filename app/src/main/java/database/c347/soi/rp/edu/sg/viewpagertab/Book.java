package database.c347.soi.rp.edu.sg.viewpagertab;

public class Book {
    private String Title;
    private String Category;
    private String Description;
//    private int Image;
    private String imgURL;

    public Book() {
    }

    public Book(String title, String category, String description, String imgURL) {
        Title = title;
        Category = category;
        Description = description;
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
