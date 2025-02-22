package com.controller.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "issue")
public class IssueReport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String email;
	private String url;
	private String description;
	private boolean maskedAsPrivate;
	private boolean updates;
	private boolean done;
	private Date created;
	private Date updated;

	public IssueReport() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isMaskedAsPrivate() {
		return maskedAsPrivate;
	}

	public void setMaskedAsPrivate(boolean maskedAsPrivate) {
		this.maskedAsPrivate = maskedAsPrivate;
	}

	public boolean isUpdates() {
		return updates;
	}

	public void setUpdates(boolean updates) {
		this.updates = updates;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}
