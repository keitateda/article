package jp.co.comnic.lesson.webapp.article.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ARTICLE database table.
 * 
 */
@Entity
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="article_id")
	private int articleId;

	private String contents;

	private String title;

	@Temporal(TemporalType.DATE)
	@Column(name="upload_day")
	private Date uploadDay;

	@Column(name="upload_name")
	private String uploadName;

	//bi-directional many-to-one association to Category
	@ManyToOne
	private Category category;

	public Article() {
	}

	public int getArticleId() {
		return this.articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUploadDay() {
		return this.uploadDay;
	}

	public void setUploadDay(Date uploadDay) {
		this.uploadDay = uploadDay;
	}

	public String getUploadName() {
		return this.uploadName;
	}

	public void setUploadName(String uploadName) {
		this.uploadName = uploadName;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}