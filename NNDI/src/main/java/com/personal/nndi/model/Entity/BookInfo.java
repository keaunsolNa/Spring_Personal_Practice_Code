package com.personal.nndi.model.Entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TBL_BOOK_INFO")
public class BookInfo implements Serializable{
	
	private static final long serialVersionUID = 7029242701954189600L;

//	NUM	NUMBER
//	CATE_NUM	NUMBER
//	MEM_ID	VARCHAR2(30 BYTE)
//	MANAGER_ID	VARCHAR2(30 BYTE)
//	POST_DATE	DATE
//	TITLE	VARCHAR2(50 BYTE)
//	CONTENT	CLOB
//	ANSWER_YN	VARCHAR2(30 BYTE)
//	ANSWER_CONTENT	CLOB
//	DISPLAY_YN	VARCHAR2(30 BYTE)
//	HITS	NUMBER
	
	@Id
	@Column(name="CODE")
	private int code;
	
	@Column(name="KINDS_CODE")
	private String kindsCode;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="WRITER")
	private String writer;
	
	@Column(name="LOCATION_CODE")
	private String locationCode;
	
	@Column(name="ISBN")
	private String isbn;
	
	@Column(name="SEARCH_YN")
	private String searchYN;
	
	@Column(name="PUBLISHER")
	private String publisher;

	public BookInfo() {
	}

	public BookInfo(int code, String kindsCode, String name, String writer, String locationCode, String isbn,
			String searchYN, String publisher) {
		this.code = code;
		this.kindsCode = kindsCode;
		this.name = name;
		this.writer = writer;
		this.locationCode = locationCode;
		this.isbn = isbn;
		this.searchYN = searchYN;
		this.publisher = publisher;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getKindsCode() {
		return kindsCode;
	}

	public void setKindsCode(String kindsCode) {
		this.kindsCode = kindsCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getSearchYN() {
		return searchYN;
	}

	public void setSearchYN(String searchYN) {
		this.searchYN = searchYN;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "BookInfo [code=" + code + ", kindsCode=" + kindsCode + ", name=" + name + ", writer=" + writer
				+ ", locationCode=" + locationCode + ", isbn=" + isbn + ", searchYN=" + searchYN + ", publisher="
				+ publisher + "]";
	}
	
	
	
	
}

