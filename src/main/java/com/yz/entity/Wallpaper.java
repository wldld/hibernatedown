package com.yz.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallpaper {
    private String id;
    private String thumbUrl;
    private String imgUrl;
    private String previewUrl;
    private String tag;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "thumb_url")
    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    @Basic
    @Column(name = "img_url")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Basic
    @Column(name = "preview_url")
    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wallpaper wallpaper = (Wallpaper) o;

        if (id != null ? !id.equals(wallpaper.id) : wallpaper.id != null) return false;
        if (thumbUrl != null ? !thumbUrl.equals(wallpaper.thumbUrl) : wallpaper.thumbUrl != null) return false;
        if (imgUrl != null ? !imgUrl.equals(wallpaper.imgUrl) : wallpaper.imgUrl != null) return false;
        if (previewUrl != null ? !previewUrl.equals(wallpaper.previewUrl) : wallpaper.previewUrl != null) return false;
        if (tag != null ? !tag.equals(wallpaper.tag) : wallpaper.tag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (thumbUrl != null ? thumbUrl.hashCode() : 0);
        result = 31 * result + (imgUrl != null ? imgUrl.hashCode() : 0);
        result = 31 * result + (previewUrl != null ? previewUrl.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        return result;
    }
}
