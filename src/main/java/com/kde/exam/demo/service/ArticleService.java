package com.kde.exam.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kde.exam.demo.repository.ArticleRepository;
import com.kde.exam.demo.vo.Article;

@Service
public class ArticleService {
	private ArticleRepository articleRepository;

	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;

		articleRepository.makeTestData();
	}
	
	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}

	public Article getarticle(int id) {
		return articleRepository.getArticle(id);
	}

	public String dodelete(int id) {
		return articleRepository.dodelete(id);
	}

}
