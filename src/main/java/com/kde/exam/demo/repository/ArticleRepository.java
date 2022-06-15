package com.kde.exam.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kde.exam.demo.vo.Article;

@Component
public class ArticleRepository {
	private List<Article> articles;
	private int articlesLastId;

	public ArticleRepository() {
		articles = new ArrayList<>();

	}

	public List<Article> getArticles() {
		return articles;
	}

	public void makeTestData() {
		for (int i = 1; i <= 10; i++) {
			int id = articlesLastId + 1;
			String title = "제목 " + i;
			String body = "내용 " + i;
			Article article = new Article(id, title, body);

			articles.add(article);
			articlesLastId = id;
		}
	}

	public Article getArticle(int id) {
		for (Article article : articles) {
			if (article.getId() == id) {
				return article;
			}
		}
		return null;
	}

	public String dodelete(int id) {
		Article article = getArticle(id);
		articles.remove(article);
		return id + "번이 삭제되었습니다.";
	}

}
