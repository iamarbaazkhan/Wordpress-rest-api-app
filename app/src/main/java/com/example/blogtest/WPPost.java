

package com.example.blogtest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class WPPost {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("guid")
    @Expose
    private Guid guid;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("excerpt")
    @Expose
    private Excerpt excerpt;
    @SerializedName("author")
    @Expose
    private Integer author;
    @SerializedName("featured_media")
    @Expose
    private Integer featuredMedia;
    @SerializedName("parent")
    @Expose
    private Integer parent;
    @SerializedName("menu_order")
    @Expose
    private Integer menuOrder;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("property-features")
    @Expose
    private List<Object> propertyFeatures = null;
    @SerializedName("property-types")
    @Expose
    private List<Object> propertyTypes = null;
    @SerializedName("property-cities")
    @Expose
    private List<Integer> propertyCities = null;
    @SerializedName("property-statuses")
    @Expose
    private List<Object> propertyStatuses = null;
    @SerializedName("property_meta")
    @Expose
    private PropertyMeta propertyMeta;
    @SerializedName("_links")
    @Expose
    private Links links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(Integer featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<Object> getPropertyFeatures() {
        return propertyFeatures;
    }

    public void setPropertyFeatures(List<Object> propertyFeatures) {
        this.propertyFeatures = propertyFeatures;
    }

    public List<Object> getPropertyTypes() {
        return propertyTypes;
    }

    public void setPropertyTypes(List<Object> propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    public List<Integer> getPropertyCities() {
        return propertyCities;
    }

    public void setPropertyCities(List<Integer> propertyCities) {
        this.propertyCities = propertyCities;
    }

    public List<Object> getPropertyStatuses() {
        return propertyStatuses;
    }

    public void setPropertyStatuses(List<Object> propertyStatuses) {
        this.propertyStatuses = propertyStatuses;
    }

    public PropertyMeta getPropertyMeta() {
        return propertyMeta;
    }

    public void setPropertyMeta(PropertyMeta propertyMeta) {
        this.propertyMeta = propertyMeta;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
    public class WpAttachment {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class WpFeaturedmedium {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class WpTerm {

        @SerializedName("taxonomy")
        @Expose
        private String taxonomy;
        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public String getTaxonomy() {
            return taxonomy;
        }

        public void setTaxonomy(String taxonomy) {
            this.taxonomy = taxonomy;
        }

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class About {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Author {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Collection {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Content {

        @SerializedName("rendered")
        @Expose
        private String rendered;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

    }

    public class Cury {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("href")
        @Expose
        private String href;
        @SerializedName("templated")
        @Expose
        private Boolean templated;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

        public Boolean getTemplated() {
            return templated;
        }

        public void setTemplated(Boolean templated) {
            this.templated = templated;
        }

    }

    public class Excerpt {

        @SerializedName("rendered")
        @Expose
        private String rendered;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

    }

    public class Guid {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }

    public class Links {

        @SerializedName("self")
        @Expose
        private List<Self> self = null;
        @SerializedName("collection")
        @Expose
        private List<Collection> collection = null;
        @SerializedName("about")
        @Expose
        private List<About> about = null;
        @SerializedName("author")
        @Expose
        private List<Author> author = null;
        @SerializedName("replies")
        @Expose
        private List<Reply> replies = null;
        @SerializedName("version-history")
        @Expose
        private List<VersionHistory> versionHistory = null;
        @SerializedName("predecessor-version")
        @Expose
        private List<PredecessorVersion> predecessorVersion = null;
        @SerializedName("wp:featuredmedia")
        @Expose
        private List<WpFeaturedmedium> wpFeaturedmedia = null;
        @SerializedName("wp:attachment")
        @Expose
        private List<WpAttachment> wpAttachment = null;
        @SerializedName("wp:term")
        @Expose
        private List<WpTerm> wpTerm = null;
        @SerializedName("curies")
        @Expose
        private List<Cury> curies = null;

        public List<Self> getSelf() {
            return self;
        }

        public void setSelf(List<Self> self) {
            this.self = self;
        }

        public List<Collection> getCollection() {
            return collection;
        }

        public void setCollection(List<Collection> collection) {
            this.collection = collection;
        }

        public List<About> getAbout() {
            return about;
        }

        public void setAbout(List<About> about) {
            this.about = about;
        }

        public List<Author> getAuthor() {
            return author;
        }

        public void setAuthor(List<Author> author) {
            this.author = author;
        }

        public List<Reply> getReplies() {
            return replies;
        }

        public void setReplies(List<Reply> replies) {
            this.replies = replies;
        }

        public List<VersionHistory> getVersionHistory() {
            return versionHistory;
        }

        public void setVersionHistory(List<VersionHistory> versionHistory) {
            this.versionHistory = versionHistory;
        }

        public List<PredecessorVersion> getPredecessorVersion() {
            return predecessorVersion;
        }

        public void setPredecessorVersion(List<PredecessorVersion> predecessorVersion) {
            this.predecessorVersion = predecessorVersion;
        }

        public List<WpFeaturedmedium> getWpFeaturedmedia() {
            return wpFeaturedmedia;
        }

        public void setWpFeaturedmedia(List<WpFeaturedmedium> wpFeaturedmedia) {
            this.wpFeaturedmedia = wpFeaturedmedia;
        }

        public List<WpAttachment> getWpAttachment() {
            return wpAttachment;
        }

        public void setWpAttachment(List<WpAttachment> wpAttachment) {
            this.wpAttachment = wpAttachment;
        }

        public List<WpTerm> getWpTerm() {
            return wpTerm;
        }

        public void setWpTerm(List<WpTerm> wpTerm) {
            this.wpTerm = wpTerm;
        }

        public List<Cury> getCuries() {
            return curies;
        }

        public void setCuries(List<Cury> curies) {
            this.curies = curies;
        }

    }

    public class PredecessorVersion {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("href")
        @Expose
        private String href;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }


     public class PropertyMeta {

        @SerializedName("rank_math_seo_score")
        @Expose
        private List<String> rankMathSeoScore = null;
        @SerializedName("rank_math_focus_keyword")
        @Expose
        private List<String> rankMathFocusKeyword = null;
        @SerializedName("_elementor_controls_usage")
        @Expose
        private List<String> elementorControlsUsage = null;
        @SerializedName("_thumbnail_id")
        @Expose
        private List<String> thumbnailId = null;
        @SerializedName("_edit_last")
        @Expose
        private List<String> editLast = null;
        @SerializedName("REAL_HOMES_featured")
        @Expose
        private List<String> rEALHOMESFeatured = null;
        @SerializedName("REAL_HOMES_energy_class")
        @Expose
        private List<String> rEALHOMESEnergyClass = null;
        @SerializedName("REAL_HOMES_property_location")
        @Expose
        private List<String> rEALHOMESPropertyLocation = null;
        @SerializedName("REAL_HOMES_property_address")
        @Expose
        private List<String> rEALHOMESPropertyAddress = null;
        @SerializedName("REAL_HOMES_property_map")
        @Expose
        private List<String> rEALHOMESPropertyMap = null;
        @SerializedName("REAL_HOMES_gallery_slider_type")
        @Expose
        private List<String> rEALHOMESGallerySliderType = null;
        @SerializedName("REAL_HOMES_agent_display_option")
        @Expose
        private List<String> rEALHOMESAgentDisplayOption = null;
        @SerializedName("REAL_HOMES_sticky")
        @Expose
        private List<String> rEALHOMESSticky = null;
        @SerializedName("REAL_HOMES_add_in_slider")
        @Expose
        private List<String> rEALHOMESAddInSlider = null;
        @SerializedName("inspiry_is_published")
        @Expose
        private List<String> inspiryIsPublished = null;
        @SerializedName("_single_add_custom_css")
        @Expose
        private List<String> singleAddCustomCss = null;
        @SerializedName("rwp_reviews")
        @Expose
        private List<String> rwpReviews = null;
        @SerializedName("rwp_reviewer_score")
        @Expose
        private List<String> rwpReviewerScore = null;
        @SerializedName("rwp_tables")
        @Expose
        private List<String> rwpTables = null;
        @SerializedName("rank_math_internal_links_processed")
        @Expose
        private List<String> rankMathInternalLinksProcessed = null;

        public List<String> getRankMathSeoScore() {
            return rankMathSeoScore;
        }

        public void setRankMathSeoScore(List<String> rankMathSeoScore) {
            this.rankMathSeoScore = rankMathSeoScore;
        }

        public List<String> getRankMathFocusKeyword() {
            return rankMathFocusKeyword;
        }

        public void setRankMathFocusKeyword(List<String> rankMathFocusKeyword) {
            this.rankMathFocusKeyword = rankMathFocusKeyword;
        }

        public List<String> getElementorControlsUsage() {
            return elementorControlsUsage;
        }

        public void setElementorControlsUsage(List<String> elementorControlsUsage) {
            this.elementorControlsUsage = elementorControlsUsage;
        }

        public List<String> getThumbnailId() {
            return thumbnailId;
        }

        public void setThumbnailId(List<String> thumbnailId) {
            this.thumbnailId = thumbnailId;
        }

        public List<String> getEditLast() {
            return editLast;
        }

        public void setEditLast(List<String> editLast) {
            this.editLast = editLast;
        }

        public List<String> getREALHOMESFeatured() {
            return rEALHOMESFeatured;
        }

        public void setREALHOMESFeatured(List<String> rEALHOMESFeatured) {
            this.rEALHOMESFeatured = rEALHOMESFeatured;
        }

        public List<String> getREALHOMESEnergyClass() {
            return rEALHOMESEnergyClass;
        }

        public void setREALHOMESEnergyClass(List<String> rEALHOMESEnergyClass) {
            this.rEALHOMESEnergyClass = rEALHOMESEnergyClass;
        }

        public List<String> getREALHOMESPropertyLocation() {
            return rEALHOMESPropertyLocation;
        }

        public void setREALHOMESPropertyLocation(List<String> rEALHOMESPropertyLocation) {
            this.rEALHOMESPropertyLocation = rEALHOMESPropertyLocation;
        }

        public List<String> getREALHOMESPropertyAddress() {
            return rEALHOMESPropertyAddress;
        }

        public void setREALHOMESPropertyAddress(List<String> rEALHOMESPropertyAddress) {
            this.rEALHOMESPropertyAddress = rEALHOMESPropertyAddress;
        }

        public List<String> getREALHOMESPropertyMap() {
            return rEALHOMESPropertyMap;
        }

        public void setREALHOMESPropertyMap(List<String> rEALHOMESPropertyMap) {
            this.rEALHOMESPropertyMap = rEALHOMESPropertyMap;
        }

        public List<String> getREALHOMESGallerySliderType() {
            return rEALHOMESGallerySliderType;
        }

        public void setREALHOMESGallerySliderType(List<String> rEALHOMESGallerySliderType) {
            this.rEALHOMESGallerySliderType = rEALHOMESGallerySliderType;
        }

        public List<String> getREALHOMESAgentDisplayOption() {
            return rEALHOMESAgentDisplayOption;
        }

        public void setREALHOMESAgentDisplayOption(List<String> rEALHOMESAgentDisplayOption) {
            this.rEALHOMESAgentDisplayOption = rEALHOMESAgentDisplayOption;
        }

        public List<String> getREALHOMESSticky() {
            return rEALHOMESSticky;
        }

        public void setREALHOMESSticky(List<String> rEALHOMESSticky) {
            this.rEALHOMESSticky = rEALHOMESSticky;
        }

        public List<String> getREALHOMESAddInSlider() {
            return rEALHOMESAddInSlider;
        }

        public void setREALHOMESAddInSlider(List<String> rEALHOMESAddInSlider) {
            this.rEALHOMESAddInSlider = rEALHOMESAddInSlider;
        }

        public List<String> getInspiryIsPublished() {
            return inspiryIsPublished;
        }

        public void setInspiryIsPublished(List<String> inspiryIsPublished) {
            this.inspiryIsPublished = inspiryIsPublished;
        }

        public List<String> getSingleAddCustomCss() {
            return singleAddCustomCss;
        }

        public void setSingleAddCustomCss(List<String> singleAddCustomCss) {
            this.singleAddCustomCss = singleAddCustomCss;
        }

        public List<String> getRwpReviews() {
            return rwpReviews;
        }

        public void setRwpReviews(List<String> rwpReviews) {
            this.rwpReviews = rwpReviews;
        }

        public List<String> getRwpReviewerScore() {
            return rwpReviewerScore;
        }

        public void setRwpReviewerScore(List<String> rwpReviewerScore) {
            this.rwpReviewerScore = rwpReviewerScore;
        }

        public List<String> getRwpTables() {
            return rwpTables;
        }

        public void setRwpTables(List<String> rwpTables) {
            this.rwpTables = rwpTables;
        }

        public List<String> getRankMathInternalLinksProcessed() {
            return rankMathInternalLinksProcessed;
        }

        public void setRankMathInternalLinksProcessed(List<String> rankMathInternalLinksProcessed) {
            this.rankMathInternalLinksProcessed = rankMathInternalLinksProcessed;
        }

    }

    public class Reply {

        @SerializedName("embeddable")
        @Expose
        private Boolean embeddable;
        @SerializedName("href")
        @Expose
        private String href;

        public Boolean getEmbeddable() {
            return embeddable;
        }

        public void setEmbeddable(Boolean embeddable) {
            this.embeddable = embeddable;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Self {

        @SerializedName("href")
        @Expose
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

    public class Title {

        @SerializedName("rendered")
        @Expose
        private String rendered;

        public String getRendered() {
            return rendered;
        }

        public void setRendered(String rendered) {
            this.rendered = rendered;
        }

    }

    public class VersionHistory {

        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("href")
        @Expose
        private String href;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }

    }

}

