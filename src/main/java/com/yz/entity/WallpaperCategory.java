package com.yz.entity;

import javax.persistence.*;

@Entity
@Table(name = "wallpaper_category", schema = "wallpaper", catalog = "")
public class WallpaperCategory {
    private int id;
    private String wallpaperId;
    private Integer categoryId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "wallpaper_id")
    public String getWallpaperId() {
        return wallpaperId;
    }

    public void setWallpaperId(String wallpaperId) {
        this.wallpaperId = wallpaperId;
    }

    @Basic
    @Column(name = "category_id")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WallpaperCategory that = (WallpaperCategory) o;

        if (id != that.id) return false;
        if (wallpaperId != null ? !wallpaperId.equals(that.wallpaperId) : that.wallpaperId != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (wallpaperId != null ? wallpaperId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        return result;
    }
}
