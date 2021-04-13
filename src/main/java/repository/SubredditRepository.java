package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Subreddit;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

}
