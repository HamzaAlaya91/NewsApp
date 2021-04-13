package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

}
