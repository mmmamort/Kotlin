package 老师代码;

import java.util.Objects;

/**
 * ClassName:News
 * Description:
 */
class News {
    private String imgPath;
    private String title;
    private String desc;

    public News() {
    }

    public News(String imgPath, String title, String desc) {
        this.imgPath = imgPath;
        this.title = title;
        this.desc = desc;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "News{" +
                "imgPath='" + imgPath + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(imgPath, news.imgPath) &&
                Objects.equals(title, news.title) &&
                Objects.equals(desc, news.desc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(imgPath, title, desc);
    }
}
