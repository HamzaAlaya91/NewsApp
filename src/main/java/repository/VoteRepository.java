package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
