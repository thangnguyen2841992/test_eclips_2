package com.directory.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "_keys")
public class Key {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


	    @SuppressWarnings("unused")
		private String vocabulary;

	    @SuppressWarnings("unused")
		private String japanese;

	    @SuppressWarnings("unused")
		private String katakana;

	    @SuppressWarnings("unused")
		private String kanji;

	    @SuppressWarnings("unused")
		private String vietnameseChinese;

	    @ManyToOne
	    private User user;
	    @ManyToOne
	    private Book book;
	    @ManyToOne
	    private Lesson lesson;

}
